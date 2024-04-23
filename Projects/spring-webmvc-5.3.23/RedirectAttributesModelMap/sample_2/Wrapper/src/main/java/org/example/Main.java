package org.example;


import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

public class Main {
    public static void main(String[] args) {
        RedirectAttributesModelMap redirectAttributes = new RedirectAttributesModelMap();
        ModelMap modelMap = new ModelMap();
        ModelAndView modelAndView = new ModelAndView("/myView", modelMap);

        redirectAttributes.addAllAttributes(modelMap);
        // now the attributes in modelMap are saved into the redirectAttributes
        redirectAttributes.addFlashAttribute("attribute1", "value1");
        redirectAttributes.addFlashAttribute("attribute2", "value2");

        // The code to perform the redirection goes here...

        System.out.println(redirectAttributes);
    }
}