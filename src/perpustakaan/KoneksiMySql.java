package perpustakaan;

import java.sql.*;

public class KoneksiMySql {
    static Connection koneksi;
    static Statement stmt;
    static ResultSet rs;

    public static Connection getKoneksi() {
        try {
            String url = "jdbc:mysql://localhost:3306/perpustakaan";
            String user = "root";
            String pass = "";

            // Use the new driver class
            Class.forName("com.mysql.cj.jdbc.Driver"); // Register driver
            koneksi = DriverManager.getConnection(url, user, pass);
            System.out.println("Koneksi berhasil!");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver tidak ditemukan: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
        return koneksi;
    }

    public static void main(String[] args) {
        getKoneksi();
    }
}
