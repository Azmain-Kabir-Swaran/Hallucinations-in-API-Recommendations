package org.example;


import javax.servlet.http.HttpServletResponseWrapper;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main extends HttpServletResponseWrapper {
    
    private CharArrayWriter output;

    public Main(HttpServletResponse response) {
        super(response);
        output = new CharArrayWriter();
    }

    public String getData() {
        return output.toString();
    }

    public PrintWriter getWriter() {
        return new PrintWriter(output);
    }

    // Let's add a sample usage of this wrapper:
    public static void main(String[] args) {
        HttpServletResponse response = new MockResponse();
        Main myResponseWrapper = new Main(response);
        PrintWriter writer = myResponseWrapper.getWriter();
        writer.write("Hello, World!");
        writer.flush();
        System.out.println(myResponseWrapper.getData());  // Output: Hello, World!
    }

    // Here we're creating a simple response mock for testing
    private static class MockResponse extends javax.servlet.http.HttpServletResponse {
        public void sendRedirect(String url) throws IOException {}
    }
}