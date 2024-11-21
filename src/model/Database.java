package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static final String URL = "jdbc:mysql://localhost:3306/recycle";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    // Metode untuk mendapatkan koneksi baru setiap kali dipanggil
    public Connection getNewConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.err.println("Koneksi database gagal: " + e.getMessage());
            return null;
        }
    }
    
}
