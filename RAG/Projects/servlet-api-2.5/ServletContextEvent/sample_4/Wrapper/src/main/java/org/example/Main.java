package org.example;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servletcev.ServletContextListener;
import org.apache.log4j.Logger;

public class Main implements ServletContextListener {
    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        LOGGER.info("Context initialized: " + context.getContextPath());
    }

    public void contextDestroyed(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        LOGGER.info("Context destroyed: " + context.getContextPath());
    }
}