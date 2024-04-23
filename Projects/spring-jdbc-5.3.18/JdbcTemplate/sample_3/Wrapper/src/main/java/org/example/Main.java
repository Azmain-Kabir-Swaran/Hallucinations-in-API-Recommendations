package org.example;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;

public class Main {
    public static void main(String[] args) {
        // setup data source
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/testdb"); // replace testdb with your database name
        dataSource.setUsername("postgres"); // replace postgres with your database user
        dataSource.setPassword("postgres"); // replace postgres with your database password

        // setup JdbcTemplate
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        // retrieve one row from users table
        String sqlQuery = "SELECT * FROM users WHERE id = ?";
        User user = jdbcTemplate.queryForObject(sqlQuery, new Object[] {1}, (rs, rowNum) -> new User(rs.getString("name"), rs.getString("email")));
        System.out.println(user);
    }
}