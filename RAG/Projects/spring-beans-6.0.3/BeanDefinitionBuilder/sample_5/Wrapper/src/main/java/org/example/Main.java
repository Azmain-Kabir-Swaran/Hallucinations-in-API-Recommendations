package org.example;


import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.BeanInstantiationException;
import org.springframework.beans.factory.BeanCreationException;

public class Main {
    public static void main(String[] args) {
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(MyBean.class);
        builder.addPropertyValue("property1", "value1");
        builder.addPropertyValue("property2", "value2");

        BeanDefinitionHolder holder = new BeanDefinitionHolder(builder.getBeanDefinition(), "myBean");
        BeanDefinitionReaderUtils.registerBeanDefinition(holder, registry);
    }
}