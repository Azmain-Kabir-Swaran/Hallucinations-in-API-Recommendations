package org.example;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

public class Main {

    public static void main(String[] args) {

        // Create an embedded database, that resides in memory
        var dataSource = new EmbeddedDatabaseBuilder().generateUniqueName(true).setType(EmbeddedDatabaseType.H2).build();

        // Create a JdbcTemplate to execute SQL statements
        var jdbcTemplate = new JdbcTemplate(dataSource);

        // Insert into table
        jdbcTemplate.execute("CREATE TABLE FOO (ID INTEGER, BAR VARCHAR)");
        jdbcTemplate.update("INSERT INTO FOO (ID, BAR) VALUES (?, ?)", 1, "bar");

        // Use SimpleJdbcCall to call stored procedures
        var simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("procedureName");
        var result = simpleJdbcCall.execute(Map.of("argName", "argValue"));
        System.out.println(result);
    }
}