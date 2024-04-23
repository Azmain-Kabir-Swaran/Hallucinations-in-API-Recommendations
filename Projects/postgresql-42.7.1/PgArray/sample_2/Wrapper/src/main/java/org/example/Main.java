package org.example;


import org.postgresql.jdbc.PgArray;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {

    static final String DB_URL = "jdbc:postgresql://localhost:5432/test";
    static final String USER = "postgres";
    static final String PASS = "postgres";

    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            // STEP 1: Register JDBC driver
            Class.forName("org.postgresql.Driver");

            //STEP 2: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            //STEP 3: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.prepareStatement("insert into animals (animal, age, features) values (?, ?, ?::integer[])");

            String[] features = {"green", "large"};
            PgArray array = new PgArray(features);

            stmt.setString(1, "Dog");
            stmt.setInt(2, 5);
            stmt.setArray(3, array);

            stmt.executeUpdate();
            stmt.close();

            System.out.println("Inserted records into the table...");
        } catch(SQLException se) {
            se.printStackTrace();
        } finally {
            try {
                if(stmt != null) stmt.close();
            } catch(SQLException se2) { }
            try {
                if(conn != null) return;
            } catch(SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Done");
    }
}