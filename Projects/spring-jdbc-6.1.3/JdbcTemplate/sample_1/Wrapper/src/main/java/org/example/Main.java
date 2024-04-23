package org.example;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;

public class Main {

    public static void main(String[] args) {
        DataSource dataSource = new DriverManagerDataSource("jdbc:mysql://localhost:3306/test", "user", "password");
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        String sql = "CREATE TABLE MyUsers("
                + " ID INT NOT NULL AUTO_INCREMENT,"
                + " USER_NAME VARCHAR(100) NOT NULL,"
                + " PASSWORD VARCHAR(100) NOT NULL,"
                + " EMAIL VARCHAR(100),"
                + " PRIMARY KEY (ID)"
                + ")";
        jdbcTemplate.execute(sql);

        String insertSQL = "INSERT INTO MyUsers(USER_NAME, PASSWORD, EMAIL) VALUES (?, ?, ?)";
        jdbcTemplate.update(insertSQL, "John", "pass123", "john@example.com");
        jdbcTemplate.update(insertSQL, "Tom", "pass321", "tom@example.com");

        String selectSQL = "SELECT * FROM MyUsers";
        jdbcTemplate.query(selectSQL, (rs, rowNum) -> new User(rs.getInt("ID"), rs.getString("USER_NAME"), rs.getString("PASSWORD"), rs.getString("EMAIL")))
                .forEach(user -> System.out.println(user));
    }

    static class User {
        int id;
        String userName;
        String password;
        String email;

        User(int id, String userName, String password, String email) {
            this.id = id;
            this.userName = userName;
            this.password = password;
            this.email = email;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", userName='" + userName + '\'' +
                    ", password='" + password + '\'' +
                    ", email='" + email + '\'' +
                    '}';
        }
    }
}