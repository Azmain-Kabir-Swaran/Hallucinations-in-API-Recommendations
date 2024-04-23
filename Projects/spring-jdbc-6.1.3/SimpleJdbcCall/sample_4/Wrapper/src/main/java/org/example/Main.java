package org.example;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        JdbcTemplate jdbcTemplate = /* Instantiate JdbcTemplate with your dataSource */

        SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withFunctionName("yourFunctionName")
                .returningResultSet("yourReturnResultSetName",
                        rs -> new HashMap<String, Object>(), (rs, rowNum) -> {
                            Map<String, Object> map = new HashMap<>();
                            map.put("column_name", rs.getObject("column_name"));
                            return map;
                        });

        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("param_name", "value");

        Map<String, Object> results = simpleJdbcCall.execute(params);

        results.forEach((k, v) -> {
            System.out.println(k + ":" + v);
        });
    }
}