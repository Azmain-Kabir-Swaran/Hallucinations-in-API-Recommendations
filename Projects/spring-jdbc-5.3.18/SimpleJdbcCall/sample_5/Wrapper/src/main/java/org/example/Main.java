package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(context.getBean(JdbcTemplate.class)
                                                                .getJdbcOperations())
                .withProcedureName("SP_Example");

        try {
            Map<String, Object> result = simpleJdbcCall.execute();
            System.out.println(result);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }
}