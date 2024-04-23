package org.example;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUsername("root");
        dataSource.setPassword("password");

        // create JdbcTemplate
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(jdbcTemplate)
                .withTableName("test_table")
                .usingColumns("column1", "column2");

        // Insertion of row
        Map<String, Object> parameters = new HashMap<>(2);
        parameters.put("column1", "value1");
        parameters.put("column2", "value2");
        simpleJdbcInsert.execute(parameters);
    }
}