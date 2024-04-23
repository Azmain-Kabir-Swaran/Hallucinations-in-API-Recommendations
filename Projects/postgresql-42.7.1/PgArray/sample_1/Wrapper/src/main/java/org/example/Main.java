package org.example;


import org.postgresql.PGConnection;
import org.postgresql.PGParameterDescription;
import org.postgresql.PGPreparedStatement;
import org.postgresql.util.PGInterval;
import org.postgresql.util.PGobject;
import java.sql.*;

public class Main {

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement stmt = null;
        PGPreparedStatement pstmt = null;

        try {
            String url = "jdbc:postgresql://localhost/test";
            Properties props = new Properties();
            props.setProperty("user","me");
            props.setProperty("password","secret");

            // load the driver
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, props);

            // create a table
            stmt = conn.createStatement();
            String sql = "CREATE TABLE test_table (id serial PRIMARY KEY, data text[])";
            stmt.executeUpdate(sql);
            System.out.println("Created table in given database...");

            // insert a row
            stmt = conn.prepareStatement("INSERT INTO test_table(data) VALUES (?)");
            ((PGConnection)conn).getPgConnection().createArrayOf("text", new String[]{"foo", "bar"});
            pstmt = ((PGConnection)conn).prepareStatement("INSERT INTO test_table(data) VALUES (?)");
            pstmt.setArray(1, ((PGConnection)conn).getPgConnection().createArrayOf("text", new String[]{"foo", "bar"}));
            pstmt.execute();
            System.out.println("Inserted row into table...");

            // retrieve row
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM test_table");
            while (rs.next()) {
                String[] rowData = (String[])rs.getArray(2).getArray();
                for(String str : rowData)
                {
                    System.out.print(str + " ");
                }
                System.out.println();
            }
            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(stmt != null) stmt.close();
                if(conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}