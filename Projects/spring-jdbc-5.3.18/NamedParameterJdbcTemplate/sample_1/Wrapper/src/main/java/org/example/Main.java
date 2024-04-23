package org.example;


import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        DataSource dataSource = new EmbeddedDatabaseBuilder()
                .generateUniqueName(true)
                .setType(EmbeddedDatabaseType.HSQL)
                .build();

        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(dataSource);
        String sql = "insert into mytable values (:id, :name)";
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("id", 2);
        parameters.put("name", "John");
        template.update(sql, parameters);
    }
}