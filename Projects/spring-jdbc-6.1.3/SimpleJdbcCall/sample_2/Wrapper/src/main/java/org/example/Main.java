package org.example;


import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Main {

    public static void main(String[] args) {

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver"); // Set your driver class name
        dataSource.setUrl("jdbc:mysql://localhost/test");  // Set your database URL 
        dataSource.setUsername("username"); // Set your database username
        dataSource.setPassword("password"); // Set your database password

        SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(dataSource)
                .withProcedureName("getUserDetails"); // Set your stored procedure name

        MapSqlParameterSource in = new MapSqlParameterSource()
                .addValue("user_id", 1);

        Map<String, Object> out = simpleJdbcCall.execute(in);

        // Now you can get the values from the stored procedure call using 'out'
    }
}