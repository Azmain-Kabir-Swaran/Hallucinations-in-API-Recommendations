package org.example;


import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;

public class Main {
    public static void main(String[] args) {
        // Use BeanDefinitionBuilder to create a bean definition
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(MyBean.class);
        builder.addPropertyValue("property1", "value1");
        builder.addPropertyReference("property2", "existingBean");
        BeanDefinition definition = builder.getBeanDefinition();

        // Create the bean factory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // Register the bean definition with the factory
        beanFactory.registerBeanDefinition("myBean", definition);

        // Retrieve the bean from the factory
        MyBean myBean = (MyBean)beanFactory.getBean("myBean");

        // Output the bean information
        System.out.println(myBean);
    }
}