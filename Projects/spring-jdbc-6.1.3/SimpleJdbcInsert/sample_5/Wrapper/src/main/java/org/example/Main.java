package org.example;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import javax.sql.DataSource;

public class Main {

    private DataSource dataSource;

    public Main(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void insertData(User user) {
        SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(dataSource);
        simpleJdbcInsert.withTableName("users")
                .usingColumns("first_name", "last_name", "email")
                .usingGeneratedKeyColumns("user_id");

        BeanPropertySqlParameterSource beanPS = new BeanPropertySqlParameterSource(user);
        int id = simpleJdbcInsert.executeAndReturnKey(beanPS).intValue();
        System.out.println("Generated ID: " + id);
    }
}