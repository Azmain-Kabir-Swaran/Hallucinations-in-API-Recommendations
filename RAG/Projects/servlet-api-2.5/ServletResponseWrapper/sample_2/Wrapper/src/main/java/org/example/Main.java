package org.example;


import javax.servlet.ServletResponseWrapper;
import java.io.CharArrayWriter;
import java.iojava.io.PrintWriter;

public class Main extends ServletResponseWrapper {

    public Main(ServletResponse response) {
        super(response);
    }

    private PrintWriter printWriter = null;
    private CharArrayWriter output = new CharArrayWriter();

    public PrintWriter getWriter() {
        if (printWriter == null) {
            printWriter = new PrintWriter(output);
        }
        return printWriter;
    }

    public void flush() throws java.io.IOException {
        printWriter.flush();
    }

    public String getResponseData() {
        return output.toString();
    }

    public static void main(String[] args) {
        // Your main code logic here
    }
}