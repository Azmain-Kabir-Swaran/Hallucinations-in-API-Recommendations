package org.example;


import com.fasterxml.jackson.core.util.VersionUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

public class Main {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());

        // Replace 'yourObject' with the actual object you want to convert to YAML format
        YourClass yourObject = new YourClass();
        
        // Converts object to YAML string and then prints it
        String yamlString = mapper.writeValueAsString(yourObject);
        System.out.println(yamlString);
    }

    // Define your class here
    private static class YourClass {
        // Your implementation here
    }

}