package org.example;


import java.util.*;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import javax.sql.DataSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Main {

    public static void main(String[] args) {
        // Set up a datasource
        DataSource ds = new DriverManagerDataSource("jdbc:derby:memory:mydb", "user", "password");

        // Create a simple jdbc call object
        SimpleJdbcCall call = new SimpleJdbcCall(ds)
        .withProcedureName("myProcedure");

        // Setup input params
        Map<String, Object> params = new HashMap<>();
        params.put("inputParam1", "someValue");
        params.put("inputParam2", 123);

        // Execute the call
        Map<String, Object> result = call.execute(params);

        // Get the output values
        String outputParam1 = (String) result.get("outputParam1");
        int outputParam2 = (Integer) result.get("outputParam2");
    }
}