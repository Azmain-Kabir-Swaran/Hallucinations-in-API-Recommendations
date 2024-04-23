package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

public class EmployeeDao extends NamedParameterJdbcDaoSupport {

    public List<Map<String, Object>> getEmployees() {
        String sql = "SELECT * FROM employee_table";
        return getNamedParameterJdbcTemplate().queryForList(sql, new HashMap<>());
    }

}