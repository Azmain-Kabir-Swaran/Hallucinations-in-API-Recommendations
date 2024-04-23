package org.example;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(DataSource()); // Create JDBC Template
        SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate)
                .withTableName("employees") // name of table
                .usingColumns("first_name", "last_name", "email")
                .usingGeneratedKeyColumns("id");
        
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("first_name", "John"); // Add your data here
        parameters.put("last_name", "Doe");
        parameters.put("email", "john.doe@gmail.com");

        int insert = insert.execute(parameters);
        
        if (insert == 1) {
            System.out.println("Successfully inserted into table");
        } else {
            System.out.println("Failed to insert into table");
        }
    }
}