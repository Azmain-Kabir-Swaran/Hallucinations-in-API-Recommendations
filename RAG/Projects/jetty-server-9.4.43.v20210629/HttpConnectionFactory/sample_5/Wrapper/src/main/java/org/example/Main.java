package org.example;


import org.eclipse.jetty.http.HttpConnectionFactory;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.util.thread.QueuedThreadPool;

public class Main {
    public static void main(String[] args) throws Exception {
        QueuedThreadPool threadPool = new QueuedThreadPool(10, 100, 1000);
        Server server = new Server(threadPool);

        ServletContextHandler context = new ServletContextHandler(server, "/hello", ServletContextHandler.SESSIONS);
        context.setAttribute("org.eclipse.jetty.servlet.Default.maxFormContentSize", -1);

        HttpConnectionFactory httpConnectionFactory = new HttpConnectionFactory(context);
        server.setHandler(httpConnectionFactory);

        server.start();
        server.join();
    }
}