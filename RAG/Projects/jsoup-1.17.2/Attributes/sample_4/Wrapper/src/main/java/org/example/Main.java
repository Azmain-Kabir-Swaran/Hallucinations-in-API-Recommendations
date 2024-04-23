package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

public class Main {
    public static void main(String[] args) throws Exception {
        // Creating a Document from a URL
        Document doc = Jsoup.connect("http://example.com").parser(Parser.htmlParser()).get();

        // get elements by id
        Element link = doc.getElementById("someid");

        // changing the attribute
        link.attr("abs:href", "http://somewhere.com");

        // creating a new attribute
        link.attr("newAttr", "test");

        // reading attributes
        String id = link.attr("id");
        String href = link.attr("abs:href");
        String newAttr = link.attr("newAttr");

        // print attribute values
        System.out.println("id: " + id);
        System.out.println("href: " + href);
        System.out.println("newAttr: " + newAttr);
    }
}