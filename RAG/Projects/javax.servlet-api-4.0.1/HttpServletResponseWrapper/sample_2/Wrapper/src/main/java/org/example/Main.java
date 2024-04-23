package org.example;


import javax.servlet.http.HttpServletResponseWrapper;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        HttpServletResponse httpServletResponse = new HttpServletResponseWrapper();
        try {
            httpServletResponse.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Internal Server Error");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}