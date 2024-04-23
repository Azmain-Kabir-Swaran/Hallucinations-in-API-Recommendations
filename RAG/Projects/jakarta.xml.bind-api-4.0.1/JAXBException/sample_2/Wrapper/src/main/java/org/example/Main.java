package org.example;


import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import java.io.File;

public class Main {

    public static void main(String[] args) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(MyObject.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            
            MyObject myObject = new MyObject("1", "Jakarta");
            marshaller.marshal(myObject, new File("myObject.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    private static class MyObject {
        private String id;
        private String name;

        public MyObject(String id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}