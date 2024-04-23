package org.example;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import javax.sql.DataSource;

public class Main {

    public static void main(String[] args) {
        // Create data source
        DataSource dataSource = /* get data source from Spring context */;
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        // Construct a SimpleJdbcCall object for a stored procedure
        SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("yourDatabaseMethod") // Replace this with your actual procedure name
                .returningResultSet("yourSchema", (rs, rowNum) -> /* Create your return object here */); 

        // Perform the call
        Object result = simpleJdbcCall.execute();

        // Do something with the result, for example, print it to the console
        System.out.println(result);
    }
}