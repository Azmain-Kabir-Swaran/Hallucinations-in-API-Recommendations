package org.example;


import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.converters.basic.FriendlyMethodNameConverter;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setPersonName("John Doe");
        person.setAge(30);

        // Convert to XML
        XmlFriendlyNameCoder.toXml(person);

        // Convert back to Java
        Person p = (Person) XmlFriendlyNameCoder.fromXml(xml);
    }
}