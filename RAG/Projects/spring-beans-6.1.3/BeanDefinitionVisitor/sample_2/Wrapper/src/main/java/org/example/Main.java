package org.example;


import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionVisitor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

public class Main {
    
    public static class MyBeanDefinitionVisitor implements BeanDefinitionVisitor {
        public void visitBeanDefinition(BeanDefinition beanDefinition) {
            System.out.println(beanDefinition.toString());
        }
    }
    
    public static void main(String[] args) {
        // Create a bean factory with a simple bean
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        GenericBeanDefinition myBean = new GenericBeanDefinition();
        myBean.setBeanClassName("MyClass");
        beanFactory.registerBeanDefinition("myBean", myBean);
        
        // Get the bean definitions from the bean factory and visit them using the visitor
        beanFactory.getBeanDefinitionNames().forEach(name -> {
            beanFactory.getBeanDefinition(name).visit(new MyBeanDefinitionVisitor());
        });
    }
}