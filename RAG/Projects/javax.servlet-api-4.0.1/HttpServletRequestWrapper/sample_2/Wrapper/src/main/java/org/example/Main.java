package org.example;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http;

public class Main {
    public static void main(String[] args) {
        HttpServletRequest request = new MyRequestWrapper(/* pass your actual request here */);
        // use the request in the rest of your application.
    }

    static class MyRequestWrapper extends HttpServletRequestWrapper {
        public MyRequestWrapper(HttpServletRequest request) {
            super(request);
        }

        // add your additional functionality here
    }
}