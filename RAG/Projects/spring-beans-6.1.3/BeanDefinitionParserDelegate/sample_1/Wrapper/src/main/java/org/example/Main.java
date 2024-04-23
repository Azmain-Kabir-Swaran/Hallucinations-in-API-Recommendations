package org.example;


import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.BeanDefinitionParserDelegate;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = 
            new ClassPathXmlApplicationContext("spring-config.xml");
        
        XmlBeanDefinitionReader beanDefinitionReader = 
            new XmlBeanDefinitionReader(context);

        // Assuming you have a simple bean definition like "<bean id="foo" class="com.example.Foo"/>"
        String definition = "<bean id=\"foo\" class=\"com.example.Foo\"/>";

        BeanDefinitionParserDelegate delegate = beanDefinitionReader.getDelegate();
        delegate.parseBeanDefinitionElement(delegate.parseState.currentTag, delegate.parseState.reader);
    }
}