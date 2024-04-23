package org.example;


import org.springframework.context.support.FileSystemXmlApplicationContext;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("file:///path/to/applicationContext.xml");
        List<String> beans = new ArrayList<>();
        for(String name: context.getBeanDefinitionNames()) {
            beans.add(name);
        }

        System.out.println("Bean Names: " + beans);
        context.close();
    }
}