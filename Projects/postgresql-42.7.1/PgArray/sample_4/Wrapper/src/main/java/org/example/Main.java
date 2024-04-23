package org.example;


import java.sql.*;
import org.postgresql.PGConnection;
import org.postgresql.PGParameterDescription;
import org.postgresql.PGPreparedStatement;
import org.postgresql.PGStatement;
import org.postgresql.util.PGobject;
import org.postgresql.util.PSQLException;

public class Main {
   public static void main(String[] args) {
      Connection connection = null;
      try {
         connection = DriverManager.getConnection(
            "jdbc:postgresql://localhost:5432/test", "postgres", "password");

         // Execute a query
         String query = "SELECT * FROM your_table";
         PreparedStatement statement = connection.prepareStatement(query);
         ResultSet resultSet = statement.executeQuery();

         while (resultSet.next()) {
            System.out.println(resultSet.getString(1)); // assuming you want to print out the first column
         }

         connection.close();
      } catch (SQLException e) {
         System.err.println("SQLException: " + e.getMessage());
      }
   }
}