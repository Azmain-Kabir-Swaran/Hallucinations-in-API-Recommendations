package org.example;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 30);
        Gson gson = new GsonBuilder().create();
        String json = gson.toJson(person);

        System.out.println(json);
    }

    private static class Person {
        private String firstName;
        private String lastName;
        private int age;

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }
    }
}