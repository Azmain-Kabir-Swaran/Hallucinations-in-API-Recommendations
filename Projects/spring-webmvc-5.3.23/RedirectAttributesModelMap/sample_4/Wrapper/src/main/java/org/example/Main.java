package org.example;


import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;
import org.springframework.web.servlet.ModelAndView;

public class Main {
    public static void main(String[] args) {
        RedirectAttributesModelMap redirectAttributesModelMap = new RedirectAttributesModelMap();
        redirectAttributesModelMap.addFlashAttribute("attributeName", "attributeValue");

        ModelAndView modelAndView = new ModelAndView("viewName");
        modelAndView.addObject("objectName", "objectValue");
        modelAndView.setViewName("redirect:/redirectedView");
        
        // Other APIs can also be used as per the requirement 
        // E.g. : modelAndView.setViewName("forward:/forwardedView");
        
        // Your complete code goes here......
    }
}