package org.example;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUsername("root");
        dataSource.setPassword("password");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate)
            .withTableName("actor")
            .usingGeneratedKeyColumns("actor_id");

        Map<String, Object> parameters = new HashMap<>();
        parameters.put("first_name", "John");
        parameters.put("last_name", "Doe");
        parameters.put("last_update", "2021-06-01");

        Number newId = insertActor.executeAndReturnKey(parameters);
        System.out.println("New actor ID: " + newId);
    }
}