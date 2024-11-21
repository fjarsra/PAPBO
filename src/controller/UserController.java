package controller;

import model.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class UserController {
    private Database database;

    public UserController() {
        database = new Database();
    }

    public void loadUsers(DefaultTableModel tableModel) {
        String query = "SELECT u.nama_lengkap, p.kontak, p.domisili, u.username, u.password "
                     + "FROM users u "
                     + "JOIN pengguna p ON u.id_user = p.id_user";

        try (Connection connection = database.getNewConnection();
             PreparedStatement statement = connection.prepareStatement(query);
             ResultSet rs = statement.executeQuery()) {

            while (rs.next()) {
                tableModel.addRow(new Object[]{
                    rs.getString("nama_lengkap"),
                    rs.getString("kontak"),
                    rs.getString("domisili"),
                    rs.getString("username"),
                    rs.getString("password")
                });
            }
        } catch (SQLException e) {
            System.err.println("Gagal memuat data masyarakat: " + e.getMessage());
        }
    }

    public boolean updateUser(String username, String fullName, String kontak, String domisili) {
        String query = "UPDATE users u "
                     + "JOIN pengguna p ON u.id_user = p.id_user "
                     + "SET u.nama_lengkap = ?, p.kontak = ?, p.domisili = ? "
                     + "WHERE u.username = ?";

        try (Connection connection = database.getNewConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, fullName);
            statement.setString(2, kontak);
            statement.setString(3, domisili);
            statement.setString(4, username);

            return statement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Gagal memperbarui pengguna: " + e.getMessage());
        }
        return false;
    }
    
    public static boolean updateUserData(String currentUsername, String newUsername, String newPassword, String newKontak, String newDomisili) throws SQLException {
    // Query untuk memperbarui data pengguna
    String updateQuery = "UPDATE users u "
                       + "JOIN pengguna p ON u.id_user = p.id_user "
                       + "SET u.username = ?, u.password = ?, p.kontak = ?, p.domisili = ? "
                       + "WHERE u.username = ?";

    Database database = new Database(); // Membuat instance Database untuk koneksi

    try (Connection connection = database.getNewConnection()) {
        // Periksa apakah koneksi berhasil dibuat
        if (connection == null || connection.isClosed()) {
            throw new SQLException("Koneksi database gagal.");
        }

        // Siapkan PreparedStatement dan eksekusi query
        try (PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
            preparedStatement.setString(1, newUsername);
            preparedStatement.setString(2, newPassword);
            preparedStatement.setString(3, newKontak);
            preparedStatement.setString(4, newDomisili);
            preparedStatement.setString(5, currentUsername);

            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0; // Mengembalikan true jika ada data yang diperbarui
        }
    } catch (SQLException e) {
        System.err.println("Gagal memperbarui data pengguna: " + e.getMessage());
        throw e; // Lanjutkan melempar exception untuk ditangani di level yang lebih tinggi
    }
}
public void loadUserDataMasyarakat(DefaultTableModel tableModel) {
    String query = "SELECT u.nama_lengkap, u.username, u.password, p.kontak, p.domisili "
                 + "FROM users u "
                 + "LEFT JOIN pengguna p ON u.id_user = p.id_user "
                 + "LEFT JOIN kru k ON u.id_user = k.id_user "
                 + "WHERE k.id_user IS NULL";



    try (Connection connection = database.getNewConnection();
         PreparedStatement statement = connection.prepareStatement(query);
         ResultSet rs = statement.executeQuery()) {

        while (rs.next()) {
            tableModel.addRow(new Object[]{
                rs.getString("nama_lengkap"),
                rs.getString("kontak"),
                rs.getString("domisili"),
                rs.getString("username"),
                rs.getString("password")
            });
        }
    } catch (SQLException e) {
        System.err.println("Gagal memuat data pengguna: " + e.getMessage());
    }
}
public static boolean deleteUser(String username) throws SQLException {
    String deletePenggunaQuery = "DELETE FROM pengguna WHERE id_user = (SELECT id_user FROM users WHERE username = ?)";
    String deleteUsersQuery = "DELETE FROM users WHERE username = ?";

    Database database = new Database(); // Instance Database untuk koneksi

    try (Connection conn = database.getNewConnection()) {
        if (conn == null || conn.isClosed()) {
            throw new SQLException("Koneksi database gagal.");
        }

        // Mulai transaksi
        conn.setAutoCommit(false);

        try {
            // Hapus data dari tabel `pengguna`
            try (PreparedStatement stmtPengguna = conn.prepareStatement(deletePenggunaQuery)) {
                stmtPengguna.setString(1, username);
                stmtPengguna.executeUpdate();
            }

            // Hapus data dari tabel `users`
            try (PreparedStatement stmtUsers = conn.prepareStatement(deleteUsersQuery)) {
                stmtUsers.setString(1, username);
                int rowsAffected = stmtUsers.executeUpdate();

                if (rowsAffected > 0) {
                    // Commit jika semua operasi berhasil
                    conn.commit();
                    return true;
                } else {
                    // Rollback jika tidak ada data yang dihapus
                    conn.rollback();
                    return false;
                }
            }
        } catch (SQLException e) {
            // Rollback jika ada kesalahan selama proses
            conn.rollback();
            throw e;
        } finally {
            // Kembalikan mode autocommit ke default
            conn.setAutoCommit(true);
        }
    } catch (SQLException e) {
        System.err.println("Gagal menghapus pengguna: " + e.getMessage());
        throw e; // Propagasi exception agar bisa ditangani di level lebih tinggi
    }
}

}
