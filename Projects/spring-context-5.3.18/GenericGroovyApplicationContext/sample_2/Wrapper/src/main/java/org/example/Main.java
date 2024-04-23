package org.example;


import org.springframework.context.support.GenericGroovyApplicationContext;

public class Main {
    public static void main(String[] args) {
        GenericGroovyApplicationContext ctx = new GenericGroovyApplicationContext();
        ctx.load("file:src/main/resources/applicationContext.groovy");
        ctx.refresh();

        // Now you can get beans from the context as needed
        MyBean bean = ctx.getBean("myBean", MyBean.class);
        System.out.println(bean.getName());
    }
}