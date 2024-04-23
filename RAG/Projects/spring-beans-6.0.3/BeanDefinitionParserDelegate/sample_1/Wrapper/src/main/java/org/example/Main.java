package org.example;


import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.BeanDefinitionParserDelegate;
import org.springframework.beans.factory.xml.ConstructorArgumentValues;
import org.springframework.beans.factory.xml.ParserContext;

public class Main {
    public static void main(String[] args) {
        // Create a new BeanDefinitionParserDelegate instance
        BeanDefinitionParserDelegate parserDelegate = new BeanDefinitionParserDelegate(null, null, null, false);

        // Create a new BeanDefinitionBuilder
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(String.class, "Hello, World!");

        // Create a new ConstructorArgumentValues instance
        ConstructorArgumentValues argumentValues = parserDelegate.parseConstructorArguments(parserDelegate.getReaderContext());

        // Set the constructor argument values
        MutablePropertyValues propertyValues = new MutablePropertyValues();
        propertyValues.addPropertyValues(argumentValues.getPropertyValues());

        // Create a new bean definition using the BeanDefinitionBuilder and ConstructorArgumentValues
        beanDefinitionBuilder.addConstructorArgs(propertyValues);
    }
}