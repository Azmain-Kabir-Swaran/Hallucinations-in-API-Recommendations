package org.example;


import java.sql.*;
import org.postgresql.Driver;
import org.postgresql.core.PgConnection;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Connection connection = null;

        try {
            DriverManager.registerDriver(new Driver());
            
            Properties props = new Properties();
            props.setProperty("user","your_username");
            props.setProperty("password","your_password");
            
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/your_database", props);
            
            System.out.println("Connection established");

            if (connection != null) {
                Statement stmt = connection.createStatement();
                String sql = "SELECT * FROM your_table"; 
                ResultSet rs = stmt.executeQuery(sql);

                while (rs.next()) {
                    System.out.println(rs.getString("column_name"));
                }
            } else {
                System.out.println("Connection failed");
            }
            
        } catch (SQLException e) {
            System.out.println("An error occurred. Unable to connect to PostgreSQL server");
            e.printStackTrace();
        } finally {
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                System.out.println("An error occurred. Unable to close database connection");
                e.printStackTrace();
            }
        }
    }
}