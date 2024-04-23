package org.example;


import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        
        GenericXmlApplicationContext context = 
                new GenericXmlApplicationContext("classpath:applicationContext.xml");
        
        YourBean yourBean = context.getBean("yourBean", YourBean.class);
        System.out.println(yourBean.getMessage());

        context.close();
    }
}