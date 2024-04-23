package org.example;


import org.springframework.beans.factory.config.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.AbstractBeanDefinition;

public class Main {
    public static void main(String[] args) {
        // Create a BeanDefinitionBuilder with a specified bean class
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(MyBean.class);

        // Set some properties on the builder
        builder.addPropertyValue("property1", "value1");
        builder.addPropertyValue("property2", "value2");

        // Get the resulting BeanDefinition
        AbstractBeanDefinition beanDefinition = builder.getBeanDefinition();

        // Now you can use the beanDefinition however you need to. For example:
        // ApplicationContext context = new ClassPathXmlApplicationContext(...);
        // context.getBeanFactory().registerSingleton("myBean", beanDefinition);
    }
}