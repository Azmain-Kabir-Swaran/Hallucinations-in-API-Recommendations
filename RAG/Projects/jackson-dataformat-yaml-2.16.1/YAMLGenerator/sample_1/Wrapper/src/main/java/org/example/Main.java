package org.example;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());

        try {
            // Create a object that will be serialized to JSON
            Simple simple = new Simple("foo", "bar");

            // Write this object to a YAML file
            mapper.writer(new YAMLGenerator.Feature[]{YAMLGenerator.Feature.MINIMIZE_QUOTES}).writeValue(new File("path/to/file.yaml"), simple);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}