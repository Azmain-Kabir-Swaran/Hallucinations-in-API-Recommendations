package org.example;


import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.connectToDatabase();
    }

    public void connectToDatabase() {
        DataSource dataSource = new DriverManagerDataSource(
                "jdbc:mysql://localhost:3306/test",
                "root",
                "password");
        
        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(dataSource);
        String query = "SELECT * FROM test";
        Map<String, Object> params = new HashMap<>();
        List<Map<String, Object>> result = template.queryForList(query, params);

        System.out.println(result);
    }
}