package org.example;


import org.springframework.jdbc.core.SqlRowSetResultSetExtractor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class Main {
  public static void main(String[] args) {
    JdbcTemplate jdbcTemplate = new JdbcTemplate();
    SqlRowSetResultSetExtractor extractor = new SqlRowSetResultSetExtractor();
    SqlRowSet rowSet = jdbcTemplate.query("SELECT * FROM table", extractor);
    
    // iterate over SqlRowSet and print the values
    while(rowSet.next()) {
      System.out.println(rowSet.getString("columnName"));
    }
  }
}