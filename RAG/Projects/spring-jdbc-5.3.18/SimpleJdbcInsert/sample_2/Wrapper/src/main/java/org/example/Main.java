package org.example;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("your_database_url");
        dataSource.setUsername("your_database_username");
        dataSource.setPassword("your_database_password");
        
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(jdbcTemplate);

        Map<String, Object> parameters = new HashMap<>();
        parameters.put("name", "John Doe");
        parameters.put("email", "johndoe@example.com");

        simpleJdbcInsert.withTableName("Customers").execute(parameters);
        System.out.println("Data inserted successfully.");
    }
}