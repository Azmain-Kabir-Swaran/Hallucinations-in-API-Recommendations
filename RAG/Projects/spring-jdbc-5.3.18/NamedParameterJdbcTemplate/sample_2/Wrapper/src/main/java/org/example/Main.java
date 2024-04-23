package org.example;


import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Main {

    public static void main(String[] args) {

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/demo");
        dataSource.setUsername("root");
        dataSource.setPassword("password");

        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(dataSource);

        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("id", 1);

        String sql = "SELECT * FROM Employees WHERE id = :id";

        Employee employee = template.queryForObject(sql, params, (rs, rowNum) -> {
            Employee emp = new Employee();
            emp.setId(rs.getInt("id"));
            emp.setName(rs.getString("name"));
            emp.setAge(rs.getInt("age"));
            return emp;
        });

        System.out.println(employee.getName() + " is " + employee.getAge() + " years old");
    }
}