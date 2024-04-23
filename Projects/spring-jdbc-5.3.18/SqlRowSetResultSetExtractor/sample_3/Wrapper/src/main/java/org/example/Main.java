package org.example;


import java.sql.ResultSet;
import javax.sql.RowSet;
import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.sql.rowset.CachedRowSet;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlRowSetResultSetExtractor;

public class Main {
    public static void main(String[] args) {
        CachedRowSet rowSet = new CachedRowSet();
        rowSet.setCommand("SELECT * FROM YourTable");
        rowSet.execute();
        SqlRowSetResultSetExtractor extractor = new SqlRowSetResultSetExtractor();
        while (rowSet.next()) {
            System.out.println("Row: " + rowSet.getString(1) + " " + rowSet.getString(2));
        }
    }
}