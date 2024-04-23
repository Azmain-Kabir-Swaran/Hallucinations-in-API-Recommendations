package org.example;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Main {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/test";
        String username = "root";
        String password = "root";

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        String createTableQuery = "CREATE TABLE users (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(50), email VARCHAR(50))";
        String insertQuery = "INSERT INTO users (name, email) VALUES (?, ?)";
        String updateQuery = "UPDATE users SET email = ? WHERE name = ?";
        String deleteQuery = "DELETE FROM users WHERE id = ?";

        // create table
        jdbcTemplate.execute(createTableQuery);

        // insert data
        jdbcTemplate.update(insertQuery, "John Doe", "john.doe@example.com");

        // update data
        jdbcTemplate.update(updateQuery, "john.doe@updated.com", "John Doe");

        // delete data
        jdbcTemplate.update(deleteQuery, 1);

        // closing connection
        jdbcTemplate.getDataSource().getConnection().close();
    }
}