package Application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/dataprocessingdata";
        String user = "root";
        String password = "toor";

        Connection conn = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connection established successfully!");
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
}
