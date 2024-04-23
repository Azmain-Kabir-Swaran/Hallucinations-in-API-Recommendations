package org.example;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

class TestObject {
    private Integer id;
    private String name;
    private Date date;

    public TestObject(Integer id, String name, Date date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    // getters and setters
}