package org.example;


import org.springframework.context.support.GenericGroovyApplicationContext;

public class Main {
    public static void main(String[] args) {
        GenericGroovyApplicationContext ctx = new GenericGroovyApplicationContext("classpath:MyBean.groovy");
        MyBean bean = ctx.getBean(MyBean.class);
        bean.message();
    }
}