package org.example;


import java.util.HashMap;
import java.util.Map;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Main {

    public static void main(String[] args) {
        
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/testDB");
        dataSource.setUsername("root");
        dataSource.setPassword("password");
        
        SimpleJdbcInsert insert = new SimpleJdbcInsert(dataSource);
        
        insert.withTableName("employees");
        Map<String, Object> columns = new HashMap<>();
        columns.put("name", "John Doe");
        columns.put("age", 35);
        
        insert.execute(columns);
    }
}