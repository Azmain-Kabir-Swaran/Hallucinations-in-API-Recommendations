package org.example;


import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;

public class Main {
    public static void main(String[] args) {
        BeanDefinitionRegistry registry = null;
        GenericBeanDefinition definition = new GenericBeanDefinition();
        definition.setBeanClass(YourClass.class);

        BeanDefinitionHolder holder = new BeanDefinitionHolder(definition, YourClass.class.getName());
        registry.registerBeanDefinition(YourClass.class.getName(), holder.getBeanDefinition());
    }
}