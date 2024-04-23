package org.example;


import com.fasterxml�jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        User user = new User("John Doe", 32);

        objectMapper.writeValue(new File("user.yml"), user);

        User deserializedUser = objectMapper.readValue(new File("user.yml"), User.class);

        System.out.println("Deserialized user: " + deserializedUser);
    }

    public static class User {
        private String name;
        private int age;

        public User() {
        }

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // getters and setters

        @Override
        public String toString() {
            return "User{" + "name='" + name + '\'' + ", age=" + age + '}';
        }
    }
}