package org.example;


import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;

public class Main {
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    private JdbcTemplate jdbcTemplate;
    
    public void setDataSource(DataSource dataSource){
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
    public void insert(){
        MapSqlParameterSource parameters = new MapSqlParameterSource();
        parameters.addValue("id", 1);
        parameters.addValue("name", "John");
        String sql = "INSERT INTO table(id, name) VALUES (:id, :name)";
        namedParameterJdbcTemplate.update(sql, parameters);
    }

    public static void main(String[] args) {
        // Create an instance of Main class
        Main main = new Main();
        // Assuming we have a datasource instance dataSource
        // Here, you need to provide a DataSource implementation instead of null
        DataSource dataSource = null;
        main.setDataSource(dataSource);
        main.insert();
    }
}