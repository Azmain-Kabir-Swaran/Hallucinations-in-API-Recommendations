package org.example;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

public class Main {
    public static void main(String[] args) {
        EmployeeDao employeeDao = new EmployeeDao();
        DataSource dataSource = // get your data source correctly
        employeeDao.setDataSource(dataSource);
        employeeDao.afterPropertiesSet(); // if necessary

        List<Map<String, Object>> employees = employeeDao.getEmployees();
        for (Map<String, Object> employee : employees) {
            System.out.println("Employee: " + employee);
        }
    }
}