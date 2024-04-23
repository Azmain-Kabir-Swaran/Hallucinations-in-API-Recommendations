package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Main {
    public static void main(String[] args) {
        String html = "<html><body><p>Hello, Jsoup!</p></body></html>";
        Document doc = Jsoup.parse(html);
        System.out.println(doc.body().text()); // "Hello, Jsoup!"
    }
}