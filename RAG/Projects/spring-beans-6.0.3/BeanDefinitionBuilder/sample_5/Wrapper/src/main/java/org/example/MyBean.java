package org.example;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.BeanInstantiationException;
import org.springframework.beans.factory.BeanCreationException;

class MyBean {
    private String property1;
    private String property2;

    public void setProperty1(String property1) {
        this.property1 = property1;
    }

    public void setProperty2(String property2) {
        this.property2 = property2;
    }
}