package org.example;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class Main {

    private JdbcTemplate jdbcTemplate;

    public Main(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<String> getTitles() {
        String query = "SELECT * FROM titles";
        return jdbcTemplate.query(query, new RowMapper<String>() {
            @Override
            public String mapRow(ResultSet rs, int rowNum) throws SQLException {
                return rs.getString("title");
            }
        });
    }

    public static void main(String[] args) {
        // Please provide your DataSource here.
        Main main = new Main(/* provide your DataSource here */);

        List<String> titles = main.getTitles();
        for (String title : titles) {
            System.out.println(title);
        }
    }
}