package org.example;


import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionVisitor;

public class Main {
    public static void main(String[] args) {
        BeanDefinition bd = new BeanDefinition();
        BeanDefinitionVisitor visitor = new BeanDefinitionVisitor() {

            //Override all the methods inside BeanDefinitionVisitor

            @Override
            public boolean visitBeanDefinition(String beanName, BeanDefinition beanDefinition) {
                //do something here
                return true;
            }
        };

        bd.accept(visitor);
    }
}