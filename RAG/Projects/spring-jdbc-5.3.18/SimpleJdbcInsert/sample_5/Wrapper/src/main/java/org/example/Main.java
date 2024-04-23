package org.example;


import java.util.HashMap;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

public class Main {

    public static void main(String[] args) {

        // Obtain your DataSource somehow (like a JndiDataSourceLookup for example)
        DataSource dataSource = null; 
        JdbcTemplate template = new JdbcTemplate(dataSource);
        SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(template)
                                          .withTableName("SAMPLE") 
                                          .usingColumns("ID", "NAME");

        // Insert data
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("ID", "123");
        parameters.put("NAME", "Test User");
        jdbcInsert.execute(parameters);

    }
}