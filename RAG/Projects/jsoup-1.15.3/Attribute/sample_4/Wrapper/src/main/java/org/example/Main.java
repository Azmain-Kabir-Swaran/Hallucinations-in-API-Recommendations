package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.safety.Whitelist;

public class Main {

    public static void main(String[] args) {
        try {
            // You need an HTML document to get its body
            String html = "<html><body><p>Hello, World!</p></body></html>";
            Document doc = Jsoup.parse(html);
            
            // Get body
            Element body = doc.body();
            
            // Add attribute "title" to the body
            body.attr("title", "Body element");
            
            // Remove the attribute
            body.removeAttr("title");

            System.out.println(body);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}