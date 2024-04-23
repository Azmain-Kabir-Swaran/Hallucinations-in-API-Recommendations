package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
    public static void main(String[] args) throws Exception {
        String html = "<html><head><title>First page</title></head>"
                    + "<body><p>Parsed HTML into a doc.</p></body></html>";

        Document doc = Jsoup.parse(html);

        System.out.println("\nTitle : " + doc.title());

        Elements links = doc.select("a[href]");
        for (Element link : links) {
            System.out.println("\nLink : " + link.attr("href"));
            System.out.println("Text: " + link.text());
        }

        Elements paragraphs = doc.select("p");
        for (Element p : paragraphs) {
            System.out.println("\nParagraph: " + p.text());
        }
    }
}