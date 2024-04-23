package org.example;


import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.StaticApplicationContext;

public class Main {
    public static void main(String[] args) {
        StaticApplicationContext context = new StaticApplicationContext();

        try {
            // register a BeanDefinitionRegistryPostProcessor bean
            context.registerBeanDefinitionRegistryPostProcessor(
                    new BeanDefinitionRegistryPostProcessor() {
                        // implementation here...
                    }
            );

            context.refresh();

            // use the registered bean
            MyBean bean = context.getBean(MyBean.class);
            bean.myMethod();
        } finally {
            context.close();
        }
    }

    private static class MyBean {
        public void myMethod() {
            System.out.println("Hello, World! MyMethod");
        }
    }
}