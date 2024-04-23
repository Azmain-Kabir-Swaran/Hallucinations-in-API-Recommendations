package org.example;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionHolder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

class MyBean {
    public MyBean() {
        System.out.println("MyBean object created");
    }
}