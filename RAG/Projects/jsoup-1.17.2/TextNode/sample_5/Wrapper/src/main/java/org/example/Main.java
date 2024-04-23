package org.example;


import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;

public class Main {
    public static void main(String[] args) {
        // Create the document
        Document doc = new Document("");
        Element body = new Element(Element.Body, "", Parser.xmlParser());
        TextNode tn = new TextNode("My test text", body);
        body.appendChild(tn);
        
        // Access the textNode's data
        System.out.println(tn.getWholeText()); // "My test text"
    }
}