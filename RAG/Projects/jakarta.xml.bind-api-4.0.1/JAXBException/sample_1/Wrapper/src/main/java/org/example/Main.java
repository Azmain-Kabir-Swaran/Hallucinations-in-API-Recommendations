package org.example;


import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setName("John");
        user.setAge(25);

        JAXBContext context;
        try {
            context = JAXBContext.newInstance(User.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            // Write to System.out
            m.marshal(user, System.out);

            // Write to File
            m.marshal(user, new File("jaxb.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}