package org.example;


import org.springframework.beans.BeanMetadataElement;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionBuilder;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.context.support.StaticApplicationContext;

public class Main {

    public static void main(String[] args) {
        // Creating a bean factory
        StaticApplicationContext context = new StaticApplicationContext();
        // Registering a bean definition builder
        context.registerBeanDefinition("bean1",
                BeanDefinitionBuilder
                        .genericBeanDefinition(Object.class, () -> {
                            System.out.println("Inside the Bean1");
                            return new Object();
                        })
                        .getBeanDefinition());

        // Obtaining a bean definition
        BeanDefinition bd = context.getBeanDefinition("bean1");

        // Displaying bean definition properties
        System.out.println("Bean Definition: " + bd);

        // Getting a bean from the factory
        context.getBean("bean1");
    }
}