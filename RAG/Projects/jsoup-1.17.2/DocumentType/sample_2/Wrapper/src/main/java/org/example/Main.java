package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.safety.Whitelist;

public class Main {

    public static void main(String[] args) {
        String html = "<html><head></head><body></body></html>";

        Document doc = Jsoup.parse(html, "", Parser.xmlParser());

        DocumentType docType = doc.getFirstMergedDocumentType();

        if (docType != null) {
            String publicId = docType.getPublicId();
            String systemId = docType.getSystemId();

            System.out.println("Public ID: " + publicId);
            System.out.println("System ID: " + systemId);
        } else {
            System.out.println("Document type not found.");
        }
    }
}