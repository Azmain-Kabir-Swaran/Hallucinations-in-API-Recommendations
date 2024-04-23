package org.example;


import org.postgresql.PGConnection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/test";
        String username = "postgres";
        String password = "postgres";
        PGConnection conn = null;
        
        try {
            conn = (PGConnection) DriverManager.getConnection(url, username, password);
            System.out.println("Connection to PostgreSQL established successfully!");
        } catch (SQLException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                    System.out.println("Connection closed successfully!");
                } catch (SQLException e) {
                    System.out.println("Error while closing connection.");
                    e.printStackTrace();
                }
            }
        }
    }
}