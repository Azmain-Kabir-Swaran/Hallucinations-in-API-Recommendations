package org.example;

import org.apache.commons.lang3.builder.EqualsBuilder;

class Example {
    private String name;
    private int age;

    public Example(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Example that = (Example) obj;
        return new EqualsBuilder().append(name, that.name).append(age, that.age).isEquals();
    }

    // Getters, Setters and toString() methods...
}