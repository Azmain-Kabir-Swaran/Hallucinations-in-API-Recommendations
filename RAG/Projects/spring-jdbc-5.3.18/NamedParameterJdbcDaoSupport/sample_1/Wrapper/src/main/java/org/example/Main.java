package org.example;


import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import java.util.HashMap;
import java.util.Map;

public class Main extends NamedParameterJdbcDaoSupport {

    public void executeSQLQuery() {
        String sql = "SELECT * FROM users WHERE age > :age";
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("age", 25);
        List<Map<String, Object>> resultList = getNamedParameterJdbcTemplate().queryForList(sql, parameters);
        System.out.println(resultList);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.setDataSource(/* Your DataSource */);
        main.executeSQLQuery();
    }
}