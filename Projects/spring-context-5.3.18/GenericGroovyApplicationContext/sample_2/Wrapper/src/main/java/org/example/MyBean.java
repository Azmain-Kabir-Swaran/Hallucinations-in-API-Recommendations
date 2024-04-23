package org.example;

import org.springframework.context.support.GenericGroovyApplicationContext;

class MyBean {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}