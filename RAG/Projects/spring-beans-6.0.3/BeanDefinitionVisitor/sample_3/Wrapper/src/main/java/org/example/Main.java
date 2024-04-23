package org.example;


import org.springframework.beans.BeanDefinition;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.propertyeditors.CustomBooleanEditor;
import org.springframework.beans.propertyeditors.StringArrayPropertyEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.beans.propertyeditors.URIEditor;
import org.springframework.beans.propertyeditors.URLPropertyEditor;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ClassPathResource;

public class Main {

    public static void main(String[] args) {
        Resource resource = new ClassPathResource("beans.xml");
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader();
        reader.setResourceLoader(null);
        reader.registerCustomEditors(new MutablePropertyValues(), new StringArrayPropertyEditor(), new CustomBooleanEditor("false"), new StringTrimmerEditor(true), new URIEditor(), new URLPropertyEditor());
        reader.loadBeanDefinitions(resource);
        reader.getRegistry().forEach((name, definition) -> System.out.println(definition.toString()));
    }

}