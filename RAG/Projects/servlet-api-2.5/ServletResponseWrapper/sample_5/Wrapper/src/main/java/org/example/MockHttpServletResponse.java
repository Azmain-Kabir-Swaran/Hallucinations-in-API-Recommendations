package org.example;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.*;

class MockHttpServletResponse extends HttpServletResponseWrapper {
    private PrintWriter writer;
    private ByteArrayOutputStream output;

    public MockHttpServletResponse() {
        super(null);
        output = new ByteArrayOutputStream();
    }

    public PrintWriter getWriter() throws IOException {
        if (writer == null) {
            writer = new PrintWriter(new OutputStreamWriter(output, "UTF-8"));
        }
        return writer;
    }

    public String toString() {
        return output.toString();
    }
}