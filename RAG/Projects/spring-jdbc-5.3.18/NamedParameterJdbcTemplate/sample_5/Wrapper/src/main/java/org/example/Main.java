package org.example;


import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class Main {
    private DataSource dataSource;
    private NamedParameterJdbcTemplate jdbcTemplate;

    public Main(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List<Map<String, Object>> getUsersByName(String userName) {
        String sql = "SELECT id, name, email, status, last_access FROM users WHERE name = :userName";
        Map<String, Object> params = new HashMap<>();
        params.put("userName", userName);
        return jdbcTemplate.queryForList(sql, params);
    }

    public static void main(String[] args) {
        // assuming you already have a dataSource configured.
        // DataSource dataSource = // get your datasource here
        Main main = new Main(null);
        List<Map<String, Object>> result = main.getUsersByName("John");
        // process your result here
    }
}