package org.example;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import javax.sql.DataSource;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Assume datasource is injected into your class through DI and we will use it here.
        DataSource dataSource = null; //Inject this from your DI
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        // Create a new SimpleJdbcInsert with the specified table name and data source.
        SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate)
                                        .withTableName("Customers");

        // Create a map for insertion with required fields.
        Map<String, Object> values = new HashMap<String, Object>();
        values.put("CustomerName", "John Doe");
        values.put("ContactName", "John");
        values.put("Address", "2143 Fake Street");
        values.put("City", "Springfield");

        // Insert data into table.
        insert.execute(values);
    }
}