package org.example;


import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.util.thread.QueuedThreadPool;
import java.net.InetAddress;

public class Main {
    public static void main(String[] args) throws Exception {
        Server server = new Server();
        QueuedThreadPool threadPool = new QueuedThreadPool();

        threadPool.setName("ThreadPool");
        threadPool.setMaxThreads(100);
        threadPool.setMinThreads(10);

        server.setThreadPool(threadPool);

        ServerConnector serverConnector = new ServerConnector(server, InetAddress.getByName("localhost"), 8080);
        serverConnector.setHost("localhost");
        serverConnector.setPort(8080);

        server.addConnector(serverConnector);

        ResourceHandler resource_handler = new ResourceHandler();
        resource_handler.setDirectoriesListed(true);
        resource_handler.setWelcomeFiles(new String[]{ "index.html" });
        
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        server.setHandler(context);
        
        server.start();
        server.join();
    }
}