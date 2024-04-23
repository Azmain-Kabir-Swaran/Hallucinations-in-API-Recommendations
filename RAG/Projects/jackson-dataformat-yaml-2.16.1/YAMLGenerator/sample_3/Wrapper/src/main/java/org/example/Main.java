package org.example;


import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;
import java.io.*;

public class Main {
    
    static class User {
        public String name;
        public int age;
        public String city;

        public User(String name, int age, String city) {
            this.name = name;
            this.age = age;
            this.city = city;
        }
    }

    public static void main(String[] args) throws Exception {
        YAMLMapper mapper = new YAMLMapper();

        User user = new User("John Doe", 30, "New York");

        StringWriter writer = new StringWriter();
        YAMLGenerator yamlGenerator = new YAMLGenerator(new PrintWriter(writer));
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.enable(YAMLGenerator.Feature.WRITE_DOC_START_END_MARKERS);
        yamlGenerator.setDefaultPrettyPrinter(new DefaultPrettyPrinter());

        mapper.writeValue(yamlGenerator, user);

        writer.close();
        System.out.println(writer.toString());
    }
}