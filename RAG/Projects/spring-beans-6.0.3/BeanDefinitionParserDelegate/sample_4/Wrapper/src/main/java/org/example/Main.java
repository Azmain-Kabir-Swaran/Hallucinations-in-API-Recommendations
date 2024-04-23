package org.example;


import org.springframework.beans.factory.xml.BeanDefinitionParserDelegate;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValue;

public class Main {
    public static void main(String[] args) {
        BeanDefinitionParserDelegate parserDelegate = new BeanDefinitionParserDelegate();
        MutablePropertyValues pvs = parserDelegate.parseRawElementAttributes(null, null);
        PropertyValue pv = new PropertyValue("name", "John");
        pvs.addPropertyValue(pv);
        System.out.println(pvs);
    }
}