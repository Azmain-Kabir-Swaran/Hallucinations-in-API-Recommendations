package org.example;


import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/test";
        String username = "root";
        String password = "password";

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(jdbcUrl);
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);

        String sql = "SELECT name, age FROM people WHERE age > :minAge";

        MapSqlParameterSource namedParameters = new MapSqlParameterSource();
        namedParameters.addValue("minAge", 30);

        List<Map<String, Object>> result = namedParameterJdbcTemplate.queryForList(sql, namedParameters);

        for(Map row : result) {
            System.out.println("Name: " + row.get("name") + ", Age: " + row.get("age"));
        }
    }
}