package org.example;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.ServletContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

class CustomRequestWrapper extends HttpServletRequestWrapper {

    public CustomRequestWrapper(HttpServletRequest request) {
        super(request);
    }
}