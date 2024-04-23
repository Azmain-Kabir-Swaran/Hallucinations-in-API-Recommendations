package org.example;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.*;

class MyServletResponseWrapper extends HttpServletResponseWrapper {

    public MyServletResponseWrapper(HttpServletResponse response) {
        super(response);
    }

    @Override
    public ServletOutputStream getOutputStream() throws IOException {
        setContentType("text/html");
        return super.getOutputStream();
    }

    @Override
    public PrintWriter getWriter() throws IOException {
        setContentType("text/html");
        return super.getWriter();
    }
}