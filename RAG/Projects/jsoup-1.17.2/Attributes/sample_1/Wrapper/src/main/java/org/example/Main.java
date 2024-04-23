package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

public class Main {
    public static void main(String[] args) {
        Document document = Jsoup.parse("<html><head><title>Title</title></head>"
                + "<body><p>Hello, World!</p></body></html>");

        // Find a <p> tag that is grandchild of head.
        Element p = document.selectFirst("html > head > :grandchild(p)");
        System.out.println("The text in the <p> tag is: " + p.text());
    }
}