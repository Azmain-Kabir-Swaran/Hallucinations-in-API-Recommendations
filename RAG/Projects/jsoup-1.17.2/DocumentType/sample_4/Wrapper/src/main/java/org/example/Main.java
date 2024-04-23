package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        String url = "http://example.com"; 
        Document doc = Jsoup.connect(url).get();

        // Get DocumentType
        DocumentType dt = doc.doctype();

        // You can now manipulate the DocumentType as needed...

    }
}