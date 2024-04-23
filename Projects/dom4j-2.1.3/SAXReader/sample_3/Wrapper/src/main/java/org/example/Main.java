package org.example;


import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class Main {

    public static void main(String[] args) {
        SAXReader reader = new SAXReader();
        
        // Change the path to your XML file
        String filePath = "your/path/to/xmlfile.xml";
        try {
            Document document = reader.read(filePath);

            // Get all "book" elements
            List<Element> books = document.selectNodes("//book");
            for (Element book : books) {
                // Get the title of each book
                String title = book.elementText("title");
                System.out.println("Book Title : " + title);
            }

        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}