package org.example;


import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        NamedParameterJdbcTemplate template = context.getBean("namedParameterJdbcTemplate", NamedParameterJdbcTemplate.class);
        
        // Your SQL
        String sql = "SELECT * FROM YourTable WHERE name = :name";
        
        // Parameters
        SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("name", "YourValue");
        
        List<Map<String, Object>> results = template.queryForList(sql, namedParameters);
        
        // Process results
        results.forEach(result -> {
            // Process each result
        });
    }
}