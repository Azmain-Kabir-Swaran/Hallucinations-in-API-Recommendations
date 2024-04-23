package org.example;


import org.postgresql.PGConnection;
import org.postgresql.PGProperty;
import org.postgresql.core.Utils;
import org.postgresql.util.PGInterval;
import org.postgresql.util.PSQLException;
import org.postgresql.util.PGInterval;
import org.postgresql.util.PGobject;
import org.postgresql.util.PSQLException;
import org.postgresql.util.PGTokenType;
import java.sql.*;
import java.util.Properties;

public class Main {

    private static final String URL = "jdbc:postgresql://localhost/";
    private static final String USER = "username";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {
        Connection conn = null;
        try {
            // register the PostgreSQL driver
            Class.forName("org.postgresql.Driver");

            // create connection with database
            Properties props = new Properties();
            props.setProperty("user", USER);
            props.setProperty("password", PASSWORD);
            props.setProperty("ssl", "true");
            props.setProperty("sslfactory", "org.postgresql.ssl.NonValidatingFactory");
            conn = DriverManager.getConnection(URL, props);

            // test if connection was successful
            if (conn != null) {
                System.out.println("Connected to the database");
                Statement stmt = conn.createStatement();

                // execute a sample query
                ResultSet rs = stmt.executeQuery("SELECT * FROM table_name");

                while (rs.next()) {
                    System.out.println(rs.getString(1));
                }
            } else {
                System.out.println("Failed to make connection");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // always close connection after done
                conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}