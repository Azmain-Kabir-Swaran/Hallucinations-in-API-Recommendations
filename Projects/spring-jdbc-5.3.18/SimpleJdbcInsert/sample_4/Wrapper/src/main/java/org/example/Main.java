package org.example;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import java.util.HashMap;
import java.util.Map;
import javax.sql.DataSource;

public class Main {
    public static void main(String[] args) {
        // Assume we've got a datasource which is injected through Spring
        DataSource dataSource = null;
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(jdbcTemplate)
                .withTableName("my_table")
                .usingColumns("column1", "column2");

        Map<String, Object> values = new HashMap<>();
        values.put("column1", "value1");
        values.put("column2", "value2");

        simpleJdbcInsert.execute(values);
    }
}