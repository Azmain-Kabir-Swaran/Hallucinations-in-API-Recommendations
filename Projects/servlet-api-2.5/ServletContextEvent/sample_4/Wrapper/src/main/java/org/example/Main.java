package org.example;


import java.util.Date;
import java.text.SimpleDateFormat;
import javax.servlet.*;
import javax.servlet.http.HttpSession;
import java.text.DateFormat;

public class Main {
   public static void main(String[] args) {
       System.out.println("Start of Servlet");

       // This event will happen when the servlet is started
       ServletContextEvent event = new ServletContextEvent(new Object());

       ServletContext context = event.getServletContext();
       context.setAttribute("Name", "John Doe");
       context.log("ServletContext attribute set");

       // Getting HttpSession object to set attributes
       HttpSession session = event.getSession();
       session.setAttribute("Date", new Date());
       session.setAttribute("Time", "10:00 AM");

       System.out.println("Name of the person: " + context.getAttribute("Name"));
       context.log("Getting attribute from ServletContext: " + context.getAttribute("Name"));

       System.out.println("Current Time: " + session.getAttribute("Time"));
       context.log("Getting attribute from HttpSession: " + session.getAttribute("Time"));

       Date date = (Date) session.getAttribute("Date");
       DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
       String strDate = dateFormat.format(date);
       System.out.println("Date: " + strDate);
       context.log("Date: " + strDate);

       System.out.println("End of Servlet");
   }
}