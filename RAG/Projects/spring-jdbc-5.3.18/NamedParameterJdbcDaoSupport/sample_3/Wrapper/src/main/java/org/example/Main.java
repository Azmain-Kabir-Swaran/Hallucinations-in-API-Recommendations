package org.example;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

public class Main extends SimpleJdbcDaoSupport {

    public Main(){
        SimpleJdbcTemplate jdbcTemplate = new SimpleJdbcTemplate(getDataSource());
        //Setting up the SQL Query
        String sql = "SELECT * FROM tableName WHERE columnName=:value";
        SqlParameterSource parameters = new MapSqlParameterSource().addValue("value", "value");
        //Mapping Query Results to Custom Java Object
        ParameterizedRowMapper<CustomObject> rowMapper = new ParameterizedRowMapper<CustomObject>() {
            public CustomObject mapRow(ResultSet rs, int rowNum) throws SQLException {
                CustomObject obj = new CustomObject();
                //Set Object properties using Result Set
                return obj;
            }
        };
        //Executing the SQL Query and Mapping it to Java Object
        jdbcTemplate.query(sql, parameters, rowMapper);
    }
}