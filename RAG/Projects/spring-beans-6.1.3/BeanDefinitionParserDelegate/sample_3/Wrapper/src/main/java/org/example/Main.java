package org.example;


import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.RuntimeBeanReference;
import org.springframework.beans.factory.config.RuntimeBeanReferenceParser;

public class Main {
    public static void main(String[] args) {
        RuntimeBeanReferenceParser parser = new RuntimeBeanReferenceParser();
        RuntimeBeanReference ref = new RuntimeBeanReference("myBean");
        BeanDefinition bd = new BeanDefinition();
        bd.setPropertyValues(parser.parse(ref.getObjectType()));
        System.out.println(bd);
    }
}