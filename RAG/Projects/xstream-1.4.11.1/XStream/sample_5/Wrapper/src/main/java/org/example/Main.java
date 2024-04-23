package org.example;


import com.thoughtworks.xstream.XStream;

public class Main {

    public static void main(String[] args) {

        // Create an instance of Student
        Student student = new Student("John", 25, "Male", "10 St", "john@gmail.com");
        
        // Create an instance of XStream
        XStream xstream = new XStream();

        // Tell XStream to use the Student class as the root element
        xstream.alias("student", Student.class);
        
        // Convert the Student instance to XML
        String xml = xstream.toXML(student);

        // Print the XML string
        System.out.println(xml);

    }

}