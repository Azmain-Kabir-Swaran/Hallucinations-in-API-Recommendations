package org.example;


import org.springframework.beans.BeanInstantiationException;
import org.springframework.beans.NotReadablePropertyException;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionHolder;
import org.springframework.beans.factory.support.GenericBeanDefinition;

public class Main {

    public static void main(String[] args) {
        BeanDefinitionRegistry registry = null;
        PropertyValues propertyValues = null;
        String beanName = "yourBeanName";

        // Add properties
        propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("property1", "value1"));
        propertyValues.addPropertyValue(new PropertyValue("property2", "value2"));
        
        // Create bean definition
        GenericBeanDefinition definition = new GenericBeanDefinition();
        definition.setBeanClass(YourClass.class);
        definition.setPropertyValues(propertyValues);
        
        // Instantiate bean
        BeanDefinitionHolder definitionHolder = new BeanDefinitionHolder(definition, beanName);
        definitionHolder.setSource(registry);

        // Register bean
        try {
            registry.registerBeanDefinition(definitionHolder.getBeanDefinitionName(), definitionHolder.getBeanDefinition());
        }
        catch (BeanInstantiationException ex) {
            ex.printStackTrace();
        }
        catch (NotReadablePropertyException ex) {
            ex.printStackTrace();
        }
    }
}