package org.example;


import java.util.HashMap;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

public class Main {

    public static void main(String[] args) {

        DataSource dataSource = null; // Assuming the DataSource is correctly set up and is accessible.
        
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate).withTableName("myTableName");

        Map<String, Object> data = new HashMap<>();
        data.put("column1", "value1");
        data.put("column2", "value2");
        
        int rowsAffected = insert.execute(data);
        
        System.out.println(rowsAffected + " row(s) inserted.");
    }
}