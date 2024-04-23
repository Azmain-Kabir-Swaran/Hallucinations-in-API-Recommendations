package org.example;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class Main {

    public static void main(String[] args) {
        HttpServletRequest request = /* get an HttpServletRequest somehow */;
        CustomRequestWrapper wrapper = new CustomRequestWrapper(request);
        // use wrapper instead of request now...
    }

    private static class CustomRequestWrapper extends HttpServletRequestWrapper {
        public CustomRequestWrapper(HttpServletRequest request) {
            super(request);
            // additional custom logic here if needed
        }
    }
}