package org.example;

import com.thoughtworks.xstream.XStream;

class Student {

    private String name;
    private int age;
    private String gender;
    private String address;
    private String email;

    public Student(String name, int age, String gender, String address, String email) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

}