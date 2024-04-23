package org.example;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Main {

    private JdbcTemplate jdbcTemplate;

    public Main(String dbUrl, String username, String password) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl(dbUrl);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void createTable() {
        String sql = "CREATE TABLE customers" +
                "(id INT PRIMARY KEY, name VARCHAR(50), email VARCHAR(50))";
        jdbcTemplate.update(sql);
        System.out.println("Table created.");
    }

    public static void main(String[] args) {
        String dbUrl = "jdbc:mysql://localhost:3306/testdb";
        String username = "testuser";
        String password = "password";

        Main main = new Main(dbUrl, username, password);
        main.createTable();
    }
}