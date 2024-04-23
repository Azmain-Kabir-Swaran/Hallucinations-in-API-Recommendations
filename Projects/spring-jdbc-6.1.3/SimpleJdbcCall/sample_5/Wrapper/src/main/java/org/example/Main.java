package org.example;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import java.util.Map;
import java.util.HashMap;

public class Main {

    // Replace "jdbc:mysql://localhost:3306/test" with your DB connection url
    private static String jdbcUrl = "jdbc:mysql://localhost:3306/test";

    public static void main(String[] args) {
        // Instantiate JdbcTemplate
        JdbcTemplate jdbcTemplate = new JdbcTemplate(DataSourceUtils.getDataSource(jdbcUrl));

        // Get the stored procedure call object
        SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("procedureName");

        // Create parameters if needed
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("inputParamName", "inputValue");

        // Execute the stored procedure and retrieve result
        Map<String, Object> resultMap = simpleJdbcCall.execute(paramMap);

        // Handle the result returned from the stored procedure
        System.out.println(resultMap.get("outputParamName"));
    }
}