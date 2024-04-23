package org.example;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

public class Main {

    private JdbcTemplate jdbcTemplate;
    private DataSource dataSource;

    public Main(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public int createStudent(Student student) {
        SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(jdbcTemplate)
                .withTableName("student")
                .usingGeneratedKeyColumns("id");
        KeyHolder keyHolder = new GeneratedKeyHolder();
        simpleJdbcInsert.executeAndReturnKey(student, keyHolder);
        return keyHolder.getKey().intValue();
    }
}