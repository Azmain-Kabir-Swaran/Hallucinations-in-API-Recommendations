package org.example;


import com.thoughtworks.xstream.XStream;

public class Main {

    public static void main(String[] args) {
        XStream xstream = new XStream();

        // Register the classes to be serialized/deserialized
        xstream.alias("student", Student.class);

        // Creating object
        Student student = new Student("John Doe");
        
        // Serialization process
        String xmlRepresentation = xstream.toXML(student);
        System.out.println(xmlRepresentation);

        // Deserialization process
        Student result = (Student) xstream.fromXML(xmlRepresentation);
        System.out.println(result.getName());
    }
}