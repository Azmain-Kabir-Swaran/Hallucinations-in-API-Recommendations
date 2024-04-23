package org.example;


import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

public class Main {

    public static void main(String[] args) {
        RedirectAttributesModelMap redirectAttributesModelMap = new RedirectAttributesModelMap();

        // Add attributes
        redirectAttributesModelMap.addAttribute("message", "Hello");
        redirectAttributesModelMap.addAttribute("number", 123);
        
        // Get attributes
        Object message = redirectAttributesModelMap.getAttribute("message");
        Object number = redirectAttributesModelMap.getAttribute("number");

        System.out.println("Message: " + message);
        System.out.println("Number: " + number);
    }
}