package org.example;


import javax.sql.DataSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

public class Main {
    public static void main(String[] args) {
        DataSource dataSource = null; // assuming you have your datasource
        SimpleJdbcInsert insert = new SimpleJdbcInsert(dataSource)
            .withTableName("employee")
            .usingColumns("id", "name", "salary");

        MapSqlParameterSource parameters = new MapSqlParameterSource()
            .addValue("id", 1)
            .addValue("name", "John")
            .addValue("salary", 5000);
            
        Number newId = insert.executeAndReturnKey(parameters);
        
        System.out.println("New employee inserted with id = " + newId);
    }
}