package org.example;


import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.SimpleBeanDefinitionRegistry;

public class Main {
    public static void main(String[] args) {
        BeanDefinitionRegistry registry = new SimpleBeanDefinitionRegistry();
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(Bean.class);
        builder.addPropertyValue("name", "John");
        registry.registerBeanDefinition("JohnBean", builder.getBeanDefinition());
    }
}