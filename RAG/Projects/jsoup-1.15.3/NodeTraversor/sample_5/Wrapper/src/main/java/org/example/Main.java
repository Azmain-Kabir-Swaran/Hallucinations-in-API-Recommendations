package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

public class Main {

    public static void main(String[] args) {
        String html = "<html><body><p>paragraph 1</p><p>paragraph 2</p></body></html>";

        Document doc = Jsoup.parse(html);
        
        // Using NodeTraversor to select and print all <p> elements
        NodeTraversor.traverse(new NodeVisitor() {
            public void head(Node node, int depth) {
                if (node instanceof Element) {
                    Element el = (Element)node;
                    if (el.tagName().equals("p")) {
                        System.out.println("p: " + el.text());
                    }
                }
            }

            public void tail(Node node, int depth) { }
        }, doc);
    }
}