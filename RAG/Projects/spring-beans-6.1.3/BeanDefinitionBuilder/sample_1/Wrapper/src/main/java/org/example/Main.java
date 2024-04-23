package org.example;


import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;

public class Main {

    public static void main(String[] args) {
        BeanFactory beanFactory = new DefaultListableBeanFactory();
        
        // Create a BeanDefinition for a specific class
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(MyBean.class);
        
        // Set properties of the bean
        builder.addPropertyValue("property1", "value1");
        builder.addPropertyValue("property2", "value2");

        // Register the bean definition in the bean factory
        beanFactory.registerBeanDefinition("myBean", builder.getBeanDefinition());

        try {
            MyBean bean = beanFactory.getBean("myBean", MyBean.class);
            // Handle your bean here
            // ...
        } catch (BeansException e) {
            e.printStackTrace();
        }
    }
}