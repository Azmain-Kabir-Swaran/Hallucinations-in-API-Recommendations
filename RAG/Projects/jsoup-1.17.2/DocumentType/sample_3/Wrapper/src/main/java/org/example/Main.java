package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Main {
    public static void main(String[] args) {
        String html = "<html><body><p>Testing...</p></body></html>";
        Document doc = Jsoup.parse(html, "", org.jsoup.parser.Parser.xmlParser());
        System.out.println(doc.documentType().name());
    }
}