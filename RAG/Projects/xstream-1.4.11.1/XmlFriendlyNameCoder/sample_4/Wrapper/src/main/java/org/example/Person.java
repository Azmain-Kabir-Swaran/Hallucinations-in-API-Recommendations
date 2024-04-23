package org.example;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.converters.basic.FriendlyMethodNameConverter;

public class Person {
    private String name;
    private int age;

    // Constructors, getters, and setters should also be defined here

    // Example usage of FriendlyMethodNameConverter
    @XStreamConverter(value= FriendlyMethodNameConverter.class, valueElement = "name")
    public void setPersonName(String name){
        this.name = name;
    }

    public String getPersonName(){
        return this.name;
    }

    // Other methods can use the same concept to map xml elements
    // to JavaBean properties or vice versa.
}