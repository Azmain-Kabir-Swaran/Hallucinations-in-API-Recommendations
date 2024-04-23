package org.example;

import javax.servlet.http.HttpServletResponseWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class Main extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    public Main() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
        
        // Using ServletResponseWrapper
        ServletResponseWrapper wrapper = new ServletResponseWrapper(response);
        wrapper.sendRedirect("https://www.example.com");
    }
    
    // Other servlet methods (like POST) should be implemented similarly
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}