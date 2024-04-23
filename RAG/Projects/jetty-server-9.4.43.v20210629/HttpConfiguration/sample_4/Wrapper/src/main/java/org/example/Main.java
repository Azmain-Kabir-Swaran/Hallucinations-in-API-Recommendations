package org.example;


import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.util.ssl.SslContextFactory;

public class Main {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);

        SslContextFactory sslContextFactory = new SslContextFactory.Server();
        sslContextFactory.setKeyStorePath("path-to-your-keystore-file");
        sslContextFactory.setKeyStorePassword("password-to-your-keystore");

        ServerConnector connector = new ServerConnector(server, sslContextFactory);
        connector.setPort(8443);

        server.addConnector(connector);

        server.start();
        server.join();
    }
}