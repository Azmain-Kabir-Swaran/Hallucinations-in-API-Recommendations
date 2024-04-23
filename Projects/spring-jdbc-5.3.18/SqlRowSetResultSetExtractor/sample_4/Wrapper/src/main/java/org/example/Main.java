package org.example;


import javax.sql.DataSource;
import org.springframework.jdbc.core.SqlRowSetResultSetExtractor;
import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;

public class Main {

  private JdbcTemplate jdbcTemplate;
  private SqlRowSetResultSetExtractor resultSetExtractor;

  public Main(DataSource dataSource) {
    this.jdbcTemplate = new JdbcTemplate(dataSource);
    this.resultSetExtractor = new SqlRowSetResultSetExtractor();
  }

  public void queryDatabase() {
    // Implement your query logic here
    String query = "YOUR QUERY HERE";
    jdbcTemplate.query(query, resultSetExtractor);
  }

  public static void main(String[] args) {
    // Create a datasource
    DataSource dataSource = null; // Initialize your datasource here

    // Pass your datasource to Main class to create an instance
    Main main = new Main(dataSource);

    // Call a method from your main class
    main.queryDatabase();
  }
}