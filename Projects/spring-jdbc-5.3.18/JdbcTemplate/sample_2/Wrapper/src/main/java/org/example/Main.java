package org.example;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Main {
    public static void main(String[] args) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/testdb");
        dataSource.setUsername("username");
        dataSource.setPassword("password");

        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);

        jdbcTemplate.execute("CREATE TABLE test (id INT, name VARCHAR(100), email VARCHAR(100))");
        jdbcTemplate.execute("INSERT INTO test VALUES (1, 'John Doe', 'john@example.com')");
        jdbcTemplate.execute("INSERT INTO test VALUES (2, 'Jane Doe', 'jane@example.com')");

        // Query and print the results
        jdbcTemplate.query("SELECT * FROM test", (rs, rowNum) ->
                System.out.println("Id: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Email: " + rs.getString("email")));
    }
}