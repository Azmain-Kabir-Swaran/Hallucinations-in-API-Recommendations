package org.example;


import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");
        MyBean myBean = (MyBean) context.getBean("myBean");
        System.out.println(myBean); // output: myValue
    }
}