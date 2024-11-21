package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Regis {
    private Database database;

    public Regis() {
        database = new Database();
    }

    public boolean register(String username, String password, String fullName, String domisili, String kontak) {
        try (Connection connection = database.getNewConnection()) {
            connection.setAutoCommit(false);

            String userQuery = "INSERT INTO users (username, password, nama_lengkap) VALUES (?, ?, ?)";
            PreparedStatement userStatement = connection.prepareStatement(userQuery, PreparedStatement.RETURN_GENERATED_KEYS);
            userStatement.setString(1, username);
            userStatement.setString(2, password);
            userStatement.setString(3, fullName);
            userStatement.executeUpdate();

            ResultSet rs = userStatement.getGeneratedKeys();
            if (rs.next()) {
                int userId = rs.getInt(1);

                String penggunaQuery = "INSERT INTO pengguna (id_user, domisili, kontak) VALUES (?, ?, ?)";
                PreparedStatement penggunaStatement = connection.prepareStatement(penggunaQuery);
                penggunaStatement.setInt(1, userId);
                penggunaStatement.setString(2, domisili);
                penggunaStatement.setString(3, kontak);
                penggunaStatement.executeUpdate();
            }

            connection.commit();
            return true;
        } catch (SQLException e) {
            System.err.println("Gagal registrasi: " + e.getMessage());
            return false;
        }
    }
}
