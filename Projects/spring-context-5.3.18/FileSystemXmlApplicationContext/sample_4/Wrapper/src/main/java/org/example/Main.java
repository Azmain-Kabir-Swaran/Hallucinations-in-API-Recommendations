package org.example;


import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
        
        MyService myService = context.getBean("myService", MyService.class);
        myService.doSomething();
        
        context.close();
    }
}