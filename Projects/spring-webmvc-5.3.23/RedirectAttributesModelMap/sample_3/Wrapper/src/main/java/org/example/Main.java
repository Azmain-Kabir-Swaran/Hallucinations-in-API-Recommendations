package org.example;


import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

public class Main {

    public static void main(String[] args) {

        RedirectAttributesModelMap redirectAttributes = new RedirectAttributesModelMap();
        redirectAttributes.addFlashAttribute("message", "Hello Flash");
        redirectAttributes.addAttribute("message", "Hello Attribute");

        RedirectView view = new RedirectView("/redirect");
        ModelAndView modelAndView = new ModelAndView(view, redirectAttributes);

        // here you can use the modelAndView for your specific use case
    }
}