package controller;

import model.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import model.CurrentUser;
import model.User;

public class RequestController {
    private Database database;

    public RequestController() {
        database = new Database();
    }

    public void loadRequestsKru(DefaultTableModel tableModel) {
        String query = "SELECT r.id_request, u.nama_lengkap, p.kontak, p.domisili, s.jenis_sampah, "
                     + "r.jam_masuk, r.jam_jemput, r.status "
                     + "FROM request r "
                     + "JOIN users u ON r.users_id_user = u.id_user "
                     + "JOIN pengguna p ON u.id_user = p.id_user "
                     + "JOIN sampah s ON r.sampah_id_sampah = s.id_sampah";

        try (Connection connection = database.getNewConnection();
             PreparedStatement statement = connection.prepareStatement(query);
             ResultSet rs = statement.executeQuery()) {

            while (rs.next()) {
                tableModel.addRow(new Object[]{
                    rs.getString("nama_lengkap"),
                    rs.getString("kontak"),
                    rs.getString("domisili"),
                    rs.getString("jenis_sampah"),
                    rs.getString("jam_masuk"),
                    rs.getString("jam_jemput"),
                    rs.getString("status")
                });
            }
        } catch (SQLException e) {
            System.err.println("Gagal memuat data request: " + e.getMessage());
        }
    }

    public boolean deleteRequest(int requestId) {
        String query = "DELETE FROM request WHERE id_request = ?";

        try (Connection connection = database.getNewConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setInt(1, requestId);
            return statement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Gagal menghapus request: " + e.getMessage());
        }
        return false;
    }

    public boolean updateRequestStatus(int requestId, String newStatus) {
        String query = "UPDATE request SET status = ? WHERE id_request = ?";

        try (Connection connection = database.getNewConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, newStatus);
            statement.setInt(2, requestId);
            return statement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Gagal memperbarui status request: " + e.getMessage());
        }
        return false;
    }
public boolean saveRequest(int userId, String sampahId) {
    String query = "INSERT INTO request (jam_masuk, users_id_user, sampah_id_sampah) VALUES (NOW(), ?, ?)";
    
    try (Connection connection = database.getNewConnection();
         PreparedStatement statement = connection.prepareStatement(query)) {

        statement.setInt(1, userId);
        statement.setString(2, sampahId);
        return statement.executeUpdate() > 0;
    } catch (SQLException e) {
        System.err.println("Gagal menyimpan request: " + e.getMessage());
    }
    return false;
}

public void loadRequestsHistory(DefaultTableModel tableModel) {
    // Mendapatkan ID pengguna yang sedang login
    User currentUser = CurrentUser.getInstance();
    if (currentUser == null) {
        System.err.println("Pengguna belum login.");
        return;
    }

    int currentUserId = currentUser.getIdUser();

    // Query SQL dengan filter berdasarkan user_id
    String query = "SELECT r.id_request, s.jenis_sampah, r.jam_masuk, r.jam_jemput, r.status, r.estimasi, r.kru_penjemput " +
                   "FROM recycle.request r " +
                   "JOIN recycle.sampah s ON r.sampah_id_sampah = s.id_sampah " +
                   "WHERE r.users_id_user = ?"; // Menggunakan kolom yang benar

    try (Connection connection = database.getNewConnection();
         PreparedStatement statement = connection.prepareStatement(query)) {

        // Mengatur parameter user_id
        statement.setInt(1, currentUserId);

        // Menjalankan query
        try (ResultSet resultSet = statement.executeQuery()) {
            // Iterasi setiap baris hasil query
            while (resultSet.next()) {
                Object[] rowData = {
                    resultSet.getInt("id_request"),         // Kolom 1: ID Request
                    resultSet.getString("jenis_sampah"),    // Kolom 2: Jenis Sampah
                    resultSet.getString("jam_masuk"),       // Kolom 3: Jam Request
                    resultSet.getString("jam_jemput"),      // Kolom 4: Jam Jemput
                    resultSet.getString("status"),          // Kolom 5: Status
                    resultSet.getString("estimasi"),        // Kolom 6: Estimasi
                    resultSet.getString("kru_penjemput")    // Kolom 7: Kru Penjemput
                };
                // Tambahkan data ke model tabel
                tableModel.addRow(rowData);
            }
        }
    } catch (SQLException e) {
        System.err.println("Gagal memuat data: " + e.getMessage());
    }
}


public boolean updateRequestStatusInDatabase(int requestId, String newStatus) {
    String query = "UPDATE recycle.request SET status = ? WHERE id_request = ?";
    try (Connection connection = database.getNewConnection();
         PreparedStatement statement = connection.prepareStatement(query)) {

        statement.setString(1, newStatus);
        statement.setInt(2, requestId);

        int rowsUpdated = statement.executeUpdate();
        return rowsUpdated > 0;
    } catch (SQLException e) {
        System.err.println("Error updating request status: " + e.getMessage());
    }
    return false;
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
}


