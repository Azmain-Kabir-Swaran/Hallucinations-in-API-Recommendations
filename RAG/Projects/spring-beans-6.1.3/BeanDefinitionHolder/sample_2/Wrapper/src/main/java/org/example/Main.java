package org.example;


import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionHolder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

public class Main {
    public static void main(String[] args) {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.rootBeanDefinition(MyBean.class);
        BeanDefinitionHolder beanDefinitionHolder = new BeanDefinitionHolder(beanDefinitionBuilder.getBeanDefinition(), "myBean");

        beanFactory.registerBeanDefinition("myBean", beanDefinitionHolder.getBeanDefinition());
    }
}