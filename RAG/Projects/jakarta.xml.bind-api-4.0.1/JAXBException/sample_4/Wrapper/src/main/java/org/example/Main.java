package org.example;


import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;

public class Main {
    public static void main(String[] args) {
        try {
            JAXBContext context = JAXBContext.newInstance(User.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            User user = new User("John Doe", 30);

            StringWriter writer = new StringWriter();
            marshaller.marshal(user, writer);

            System.out.println(writer.toString());

            String xml = "<user><name>John Doe</name><age>30</age></user>";
            StringReader reader = new StringReader(xml);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            User result = (User) unmarshaller.unmarshal(reader);

            System.out.println(result.getName());
            System.out.println(result.getAge());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}