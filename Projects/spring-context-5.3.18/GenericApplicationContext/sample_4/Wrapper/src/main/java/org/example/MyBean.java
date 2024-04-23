package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

class MyBean {
    private String name;
    private int id;

    public MyBean(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}