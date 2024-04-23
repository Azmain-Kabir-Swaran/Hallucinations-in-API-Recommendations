package org.example;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Main {
    public static void main(String[] args) {
        // Initialize DriverManagerDataSource
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUsername("root");
        dataSource.setPassword("password");
        
        // JdbcTemplate initialization
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        
        // Insert statement
        String sql = "INSERT INTO user (name, age) VALUES (?, ?)";
        jdbcTemplate.update(sql, "John Doe", 30);
        
        // Select statement
        sql = "SELECT * FROM user";
        List<Map<String, Object>> users = jdbcTemplate.queryForList(sql);
        for (Map<String, Object> user : users) {
            System.out.println("Name: " + user.get("name") + ", Age: " + user.get("age"));
        }
    }
}