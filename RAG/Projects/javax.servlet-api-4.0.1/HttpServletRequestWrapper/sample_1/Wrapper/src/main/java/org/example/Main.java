package org.example;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http;

public class Main extends HttpServletRequestWrapper {

    public Main(HttpServletRequest request) {
        super(request);
    }
    
    public static void main(String[] args) {
        // Add your main logic here...
    }
}