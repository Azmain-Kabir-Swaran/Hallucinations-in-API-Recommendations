package org.example;


import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class Main {
    // Define the class which will be serialized
    @XStreamAlias("Employee")
    public static class Employee {
        @XStreamAsAttribute
        public String id;
        public String name;
    }

    public static void main(String[] args) {
        // XStream instance
        XStream xs = new XStream();

        // Register the classes
        xs.processAnnotations(Employee.class);

        // Create the object
        Employee emp = new Employee();
        emp.id = "101";
        emp.name = "John";

        // Convert object to XML
        String xml = xs.toXML(emp);
        System.out.println(xml);

        // Convert XML back to object
        Employee emp1 = (Employee) xs.fromXML(xml);
        System.out.println("ID: " + emp1.id + ", Name: " + emp1.name);
    }
}