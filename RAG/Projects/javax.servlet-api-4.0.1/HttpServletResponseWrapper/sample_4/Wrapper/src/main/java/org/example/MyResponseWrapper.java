package org.example;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;
import java.io.PrintWriter;

public class MyResponseWrapper extends HttpServletResponseWrapper {

    private final ServletOutputStream outputStream;
    private final PrintWriter writer;
    private final HttpServletResponse originalResponse;
    private boolean contentTypeWritten = false;
    private String contentType = "text/plain";

    public MyResponseWrapper(HttpServletResponse response) {
        super(response);
        originalResponse = response;
        outputStream = new MyServletOutputStream(response);
        writer = new PrintWriter(outputStream, true);
    }

    @Override
    public ServletOutputStream getOutputStream() {
        if(contentTypeWritten){
            return outputStream;
        }

        try {
            originalResponse.setContentType(contentType);
            contentTypeWritten = true;
            return outputStream;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public PrintWriter getWriter() {
        if(contentTypeWritten){
            return writer;
        }

        try {
            originalResponse.setContentType(contentType);
            contentTypeWritten = true;
            return writer;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void setContentType(String type) {
        this.contentType = type;
        super.setContentType(type);
    }

    private class MyServletOutputStream extends ServletOutputStream {

        private final HttpServletResponse originalResponse;

        public MyServletOutputStream(HttpServletResponse response) {
            this.originalResponse = response;
        }

        @Override
        public void write(int b) throws IOException {
            originalResponse.getOutputStream().write(b);
        }

        @Override
        public void flush() throws IOException {
            originalResponse.getOutputStream().flush();
        }

        @Override
        public void close() throws IOException {
            originalResponse.getOutputStream().close();
        }
    }
}