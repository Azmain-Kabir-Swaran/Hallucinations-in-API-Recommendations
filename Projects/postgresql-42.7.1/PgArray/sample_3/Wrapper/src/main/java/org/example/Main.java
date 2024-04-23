package org.example;


import java.sql.*;
import org.postgresql.PGConnection;
import org.postgresql.PGProperty;

public class Main {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/yourDbName", 
                                                   "userName", 
                                                   "password");
            statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE yourTable(id serial PRIMARY KEY, data varchar[])");
            
            // Adding an item to the database
            String sql = "INSERT INTO yourTable (data) VALUES (?)";
            PreparedStatement prepStmt = connection.prepareStatement(sql);
            Array array = connection.createArrayOf("text", new String[]{"Java", "Postgres"});
            prepStmt.setArray(1, array);
            prepStmt.executeUpdate();
            
            // Getting and displaying items from database
            sql = "SELECT * FROM yourTable";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Array arrayDB = (Array)resultSet.getArray("data");
                String[] strArray = (String[])arrayDB.getArray();
                for(String s : strArray) {
                    System.out.println(s);
                }
            }
            
            // Clean up
            statement.executeUpdate("DROP TABLE yourTable");
        } 
        catch (SQLException e) {
            e.printStackTrace();
        } 
        finally {
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } 
            catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}