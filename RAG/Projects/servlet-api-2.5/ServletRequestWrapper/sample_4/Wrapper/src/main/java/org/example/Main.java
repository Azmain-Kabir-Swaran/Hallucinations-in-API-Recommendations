package org.example;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.ServletContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Main extends s { // "Request" or "HttpServletRequest" doesn't require dependency

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        super.service(req, res);

        // Get the current request
        HttpServletRequest httpRequest = (HttpServletRequest) req;
        CustomRequestWrapper wrapper = new CustomRequestWrapper(httpRequest);

        // Perform some operations on the wrapped request
        String attributeValue = wrapper.getAttribute("myAttribute");

        // Set some attribute on the wrapped request
        wrapper.setAttribute("wrappedAttribute", "Wrapped Attribute Value");
    }
}