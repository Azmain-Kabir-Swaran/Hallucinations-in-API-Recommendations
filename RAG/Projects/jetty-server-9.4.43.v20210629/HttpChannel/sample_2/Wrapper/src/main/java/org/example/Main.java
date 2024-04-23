package org.example;


import org.eclipse.jetty.server.Server;
import org.eclipseerver.ServerConnector;
import org.eclipse.jetty.server.ServerChannel;
import org.eclipse.jetty.util.HostPort;
import org.eclipse.jetty.server.Connector;

public class Main {
    public static void main(String[] args) {
        Server server = new Server();
        ServerConnector connector = new ServerConnector(server);
        HostPort hostPort = new HostPort("127.0.0.1", 8080);
        connector.setHost(hostPort.getHost());
        connector.setPort(hostPort.getPort());

        ServerChannel serverChannel = new ServerChannel();
        connector.setServerChannel(serverChannel);

        server.addConnector(connector);

        try {
            server.start();
            server.dumpStdErr();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}