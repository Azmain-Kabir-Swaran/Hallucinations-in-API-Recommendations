package org.example;


import org.postgresql.PGConnection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/test";
        String username = "username";
        String password = "password";
        
        try (java.sql.Connection connection = DriverManager.getConnection(url, username, password)) {
            PGConnection pgConnection = connection.unwrap(PGConnection.class);
            // Now you can do whatever you need with your PGConnection.
            // Example: Print PostgreSQL version
            System.out.println(pgConnection.getServerVersion());
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}