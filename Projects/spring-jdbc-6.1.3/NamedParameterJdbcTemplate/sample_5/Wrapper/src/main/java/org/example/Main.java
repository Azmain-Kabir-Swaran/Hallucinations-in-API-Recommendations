package org.example;


import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Main {
  
    public static void main(String[] args) {
        DataSource dataSource = new DriverManagerDataSource("jdbc:mysql://localhost/test", "user", "password");

        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(dataSource);

        String sql = "SELECT * FROM users WHERE username = :name";
        List<Map<String, Object>> list = template.queryForList(sql, Map.of("name", "user1"));

        for(Map<String, Object> row : list) {
            for(Map.Entry<String, Object> entry : row.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
            System.out.println("------");
        }
    }
}