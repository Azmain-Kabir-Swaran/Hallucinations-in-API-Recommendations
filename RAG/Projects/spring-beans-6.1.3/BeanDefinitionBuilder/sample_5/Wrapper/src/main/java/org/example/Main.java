package org.example;


import org.springframework.beans.BeanDefinition;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.PropertyValue;

public class Main {
    public static void main(String[] args) {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(MyBean.class);

        MutablePropertyValues propertyValues = builder.getBeanDefinition().getPropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("name", "My Name"));

        beanFactory.registerBeanDefinition("myBean", builder.getBeanDefinition());

        MyBean myBean = beanFactory.getBean("myBean", MyBean.class);

        System.out.println(myBean.getName()); // It will print: My Name
    }

    static class MyBean {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}