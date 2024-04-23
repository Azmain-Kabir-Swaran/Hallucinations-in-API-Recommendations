package org.example;


import javax.sql.DataSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Main {

    public static void main(String[] args) {
        DataSource dataSource = new DriverManagerDataSource(
          "jdbc:mysql://localhost:3306/test", "username", "password");

        // JdbcTemplate initialization and usage goes here
    }
}