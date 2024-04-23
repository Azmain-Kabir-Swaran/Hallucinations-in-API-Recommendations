package org.example;


import org.springframework.context.support.FileSystemXmlApplicationContext;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext context = 
            new FileSystemXmlApplicationContext("file:" + new File("").getAbsolutePath() + "/src/main/resources/applicationContext.xml");

        // Your code goes here
        // e.g., context.getBean("beanId");
    }
}