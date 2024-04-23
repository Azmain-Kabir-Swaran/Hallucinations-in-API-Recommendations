package org.example;


import org.springframework.beans.factory.xml.BeanDefinitionParserDelegate;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.support.RootBeanDefinition;

public class Main {

    public static void main(String[] args) {
        BeanDefinitionParserDelegate delegate = new BeanDefinitionParserDelegate();
        
        // Create a bean definition with a property values (just an example).
        MutablePropertyValues pvs = new MutablePropertyValues();
        pvs.addPropertyValue("property", "value");
        RootBeanDefinition beanDefinition = new RootBeanDefinition(String.class, pvs, null);
        
        // Use the delegate to get the bean class.
        Class<?> beanClass = delegate.getBeanClass(beanDefinition);
        
        System.out.println("Bean class is: " + beanClass);
    }
}