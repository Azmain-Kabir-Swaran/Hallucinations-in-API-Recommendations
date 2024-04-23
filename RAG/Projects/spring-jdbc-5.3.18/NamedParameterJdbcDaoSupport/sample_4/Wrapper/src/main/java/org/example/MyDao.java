package org.example;

import java.util.HashMap;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

public class MyDao extends NamedParameterJdbcDaoSupport {

    @Autowired
    public MyDao(DataSource dataSource){
        setDataSource(dataSource);
    }

    public void save(Person person){
        String SQL = "INSERT INTO Person (name, age) VALUES (:name, :age)";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("name", person.getName());
        paramMap.put("age", person.getAge());
        getNamedParameterJdbcTemplate().update(SQL, paramMap);
    }
}