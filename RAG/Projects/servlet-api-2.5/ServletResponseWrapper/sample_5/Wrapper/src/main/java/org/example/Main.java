package org.example;


import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Create an instance of our servlet response wrapper
        MyServletResponseWrapper wrapper = new MyServletResponseWrapper(new MockHttpServletResponse());
        // Write something to the response
        try {
            wrapper.getWriter().println("Hello, world!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Print out the outputted content
        System.out.println(wrapper.toString());
    }
}