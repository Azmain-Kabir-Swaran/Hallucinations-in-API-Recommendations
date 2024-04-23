package org.example;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.support.RootBeanDefinition;

public class Main {
    public static void main(String[] args) {
        RootBeanDefinition beanDefinition = new RootBeanDefinition();
        MutablePropertyValues propertyValues = new MutablePropertyValues();
        propertyValues.addPropertyValue("beanClassName", "example.TestBean");
        
        BeanDefinitionHolder holder = new BeanDefinitionHolder(beanDefinition, "beanName");
        holder.setSource(beanDefinition);
        
        // You can now do something with holder or return it from a method.
    }
}