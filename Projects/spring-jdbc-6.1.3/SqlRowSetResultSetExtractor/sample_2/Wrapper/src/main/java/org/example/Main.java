package org.example;


import javax.sql.DataSource;
import javax.sql.RowSet;
import javax.sql.rowset.Predicate;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlRowSetResultSetExtractor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.lobs.DefaultLobHandler;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        // Your database related setups here
        DataSource dataSource = null; // configure your datasource
        
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(jdbcTemplate);
        
        // Assume we have a SQL query that selects all rows
        String query = "SELECT * FROM your_table";

        RowSet rowSet = jdbcTemplate.query(query, new SqlRowSetResultSetExtractor());
        while(rowSet.next()){
            // Do something with each row
            System.out.println(rowSet.getString("column_name"));
        }
    }
}