package org.example;


import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import javax.sql.DataSource;
import java.util.Collections;
import java.util.Map;

public class Main {
    private static NamedParameterJdbcTemplate template;

    public static void main(String[] args) {
        DataSource dataSource = getDataSource();
        template = new NamedParameterJdbcTemplate(dataSource);
        String query = "INSERT INTO users (username, email) VALUES (:username, :email)";
        Map<String, Object> paramMap = Collections.singletonMap("username", "johndoe");
        paramMap.put("email", "johndoe@example.com");
        template.update(query, new MapSqlParameterSource(paramMap));
    }

    private static DataSource getDataSource() {
        // Return your data source here, like a HikariCPDataSource or a BasicDataSource instance, etc.
        // For simplicity, I will return null here. You need to implement real data source in your project.
        return null;
    }
}