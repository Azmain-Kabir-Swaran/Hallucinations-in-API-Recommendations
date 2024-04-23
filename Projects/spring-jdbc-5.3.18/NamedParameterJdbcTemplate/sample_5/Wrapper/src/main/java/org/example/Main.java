package org.example;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Main {
    public static void main(String[] args) {
        // Setup data source
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUsername("root");
        dataSource.setPassword("password");

        // Create JdbcTemplate
        NamedParameterJdbcTemplate jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);

        // Define query
        String query = "SELECT * FROM test_table WHERE name = :name";

        // Prepare parameter map
        Map<String, Object> params = new HashMap<>();
        params.put("name", "test_value");

        // Execute query
        List<Map<String, Object>> result = jdbcTemplate.queryForList(query, params);

        // Output result
        for (Map<String, Object> row : result) {
            System.out.println(row);
        }
    }
}