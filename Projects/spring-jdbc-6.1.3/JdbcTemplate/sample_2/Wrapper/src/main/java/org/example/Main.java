package org.example;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // data source
        DataSource dataSource = new DriverManagerDataSource("jdbc:mysql://localhost:3306/testDB", "username", "password");

        // jdbc template
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        // sql
        String sql = "SELECT * FROM employee";

        // execute query
        List<Map<String, Object>> queryResult = jdbcTemplate.queryForList(sql);

        // print query result
        for (Map<String, Object> row : queryResult) {
            System.out.println(row.toString());
        }
    }
}