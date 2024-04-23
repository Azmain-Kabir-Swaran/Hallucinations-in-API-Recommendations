package org.example;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import javax.sql.DataSource;

public class Main {

    public static void main(String[] args) {

        DataSource dataSource = null;

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("your_stored_procedure");

        Map<String, Object> resultMap = jdbcCall.execute(Map.of("param1", param1, "param2", param2));
    }
}