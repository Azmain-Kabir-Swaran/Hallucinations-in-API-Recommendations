package org.example;


import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;

public class Main {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        ServerConnector connector = new ServerConnector(server);
        server.addConnector(connector);
        server.start();
        server.dumpStdErr();
        server.join();
    }
}