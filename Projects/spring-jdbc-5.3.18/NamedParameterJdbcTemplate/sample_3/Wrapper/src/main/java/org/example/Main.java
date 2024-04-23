package org.example;


import javax.sql.DataSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import java.util.Map;
import java.util.HashMap;

public class Main {

    private DataSource dataSource;
    private NamedParameterJdbcTemplate jdbcTemplate;

    public Main(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public void updateEmployee(String name, String email, String department) {
        String query = "UPDATE employees SET email = :email, department = :department WHERE name = :name";
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("name", name);
        paramMap.put("email", email);
        paramMap.put("department", department);
        jdbcTemplate.update(query, paramMap);
    }

    public static void main(String[] args) {
        DataSource dataSource = new DriverManagerDataSource("jdbc:mysql://localhost:3306/test", "username", "password");
        Main main = new Main(dataSource);
        main.updateEmployee("John Doe", "john.doe@example.com", "Development");
    }
}