package org.example;


import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframeworkjdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import javax.sql.DataSource;
import java.util.List;

public class Main {
    private DataSource dataSource;
    private SimpleJdbcCall simpleJdbcCall;
    
    // Configure data source
    public void init() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        this.simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("myStoredProc"); // Replace with your stored procedure name
    }

    // Execute the stored procedure
    public List<Object[]> executeProcedure() {
        SqlParameterSource in = new MapSqlParameterSource()
                .addValue("myInput", "value"); // Replace with your input parameters
        return this.simpleJdbcCall.executeProcedure(in);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.init();
        List<Object[]> result = main.executeProcedure();
        System.out.println(result); // Print the result
    }
}