package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

public class Main {

  public static void main(String[] args) {
    
    // A HTML Document parsed using Jsoup
    String htmlDocument = "<html><body><div id='myElement'>Element</div></body></html>";
    final Element root = Jsoup.parse(htmlDocument).body();
    
    // Node visitor to filter HTML elements with attribute 'id'
    NodeVisitor visitor = new NodeVisitor() {
      public void head(Node node, int depth) {
        if (node instanceof Element && ((Element)node).hasAttr("id")) {
          System.out.println("Element at depth " + depth + " has 'id' attribute : " + node);
        }
      }
      public void tail(Node node, int depth) { }
    };

    // Apply NodeTraversor
    NodeTraversor traversor = new NodeTraversor(visitor);
    traversor.traverse(root);
  }
}