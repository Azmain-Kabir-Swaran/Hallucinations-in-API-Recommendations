package org.example;


import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Main {

    public static void main(String[] args) {
        XStream xstream = new XStream(new DomDriver());
        Person person = new Person("John", "Doe");
        String xml = xstream.toXML(person);
        System.out.println(xml);
    }

    private static class Person {
        private String firstName;
        private String lastName;

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        //Getters, setters and toString are omitted here for brevity
    }
}