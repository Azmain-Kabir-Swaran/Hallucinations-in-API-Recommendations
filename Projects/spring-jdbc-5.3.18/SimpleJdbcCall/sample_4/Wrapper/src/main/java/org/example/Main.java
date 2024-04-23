package org.example;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Main {

    public static void main(String[] args) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUsername("username");
        dataSource.setPassword("password");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("procedureName");

        Map<String, Object> params = new HashMap<>();
        params.put("inputParam", "value");

        Map<String, Object> result = jdbcCall.execute(params);
        
        // You will need to map the result of stored procedure into something useful in your case.
        // Since you didn't specified the exact return type, it is just an example. 
        System.out.println("Output parameter value: " + result.get("outputParam"));
    }
}