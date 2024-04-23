package org.example;


import com.thoughtworks.xstream.XStream;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("My book", 9.99);
        XStream xstream = new XStream();
        xstream.alias("book", Book.class);
        String xml = xstream.toXML(book);
        System.out.println(xml);
        
        Book bookFromXML = (Book) xstream.fromXML(xml);
        System.out.println(bookFromXML);
    }
}