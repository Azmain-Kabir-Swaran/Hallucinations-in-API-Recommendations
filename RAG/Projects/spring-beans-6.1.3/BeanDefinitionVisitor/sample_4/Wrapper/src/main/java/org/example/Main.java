package org.example;


import org.springframework.beans.BeanInfoFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

public class Main {
    public static void main(String[] args) {
        RootBeanDefinition definition = new RootBeanDefinition();
        BeanDefinitionVisitor visitor = BeanInfoFactory.getBeanInfo(definition).getBeanDefinitionVisitor();
        visitor.visitBeanDefinition(definition);
    }
}