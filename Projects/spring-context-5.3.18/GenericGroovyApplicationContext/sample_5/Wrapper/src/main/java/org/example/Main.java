package org.example;


import org.springframework.context.support.GenericGroovyApplicationContext;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        GenericGroovyApplicationContext context = 
            new GenericGroovyApplicationContext();
        context.refresh();
        
        Map<String, String> beans = context.getBeansOfType(String.class);
        beans.forEach((beanName, bean) -> {
            System.out.println("Bean Name : " + beanName);
            System.out.println("Bean Type : " + bean.getClass().getName());
            System.out.println("Bean Value: " + bean);
        });
        
        context.close();
    }
}