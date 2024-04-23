package org.example;


import org.springframework.beans.factory.config.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

public class Main {

    public static void main(String[] args) {
        // BeanDefinitionRegistry holds definitions of the beans
        BeanDefinitionRegistry beanRegistry = new DefaultListableBeanFactory();
        // Build a BeanDefinition using BeanDefinitionBuilder
        BeanDefinitionBuilder beanBuilder = BeanDefinitionBuilder.rootBeanDefinition(Object.class);
        beanBuilder.setInitMethodName("init");
        beanBuilder.addPropertyReference("myReference", "myReferenceBean");
        // Register the bean definition in the registry
        beanRegistry.registerBeanDefinition("myBean", beanBuilder.getBeanDefinition());
    }
}