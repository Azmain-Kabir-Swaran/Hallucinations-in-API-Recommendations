package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.NodeTraversor;
import org.jsoup.nodes.NodeVisitor;

public class Main {

    public static void main(String[] args) {
        String html = "<html><head><title>Sample Title</title></head>"
                + "<body><p>Example paragraph.</p></body></html>";

        Document doc = Jsoup.parse(html);

        NodeVisitor visitor = new NodeVisitor() {
            public void head(Node node, int depth) {
                if (node instanceof Element) {
                    Element el = (Element) node;
                    System.out.println("<" + el.tagName() + ">: " + el.data());
                }
            }

            public void tail(Node node, int depth) {
            }
        };

        NodeTraversor nodeTraversor = new NodeTraversor(visitor);
        nodeTraversor.traverse(doc);
    }
}