package org.example;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;

public class CustomResponse extends HttpServletResponseWrapper {

    private String body;

    public CustomResponse(HttpServletResponse response) {
        super(response);
    }

    @Override
    public void sendRedirect(String location) throws IOException {
        super.sendRedirect(location);
    }

    public String getBody() {
        return body;
    }
}