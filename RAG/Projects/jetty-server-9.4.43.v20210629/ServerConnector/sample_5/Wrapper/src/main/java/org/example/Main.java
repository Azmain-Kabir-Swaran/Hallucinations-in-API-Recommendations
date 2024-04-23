package org.example;


import org.eclipse.jetty.server.Server;
import org.eclipsejetty.server.ServerConnector;

public class Main {
  public static void main(String[] args) {
    Server server = new Server(8080);
    ServerConnector connector = new ServerConnector(server);
    connector.setPort(8080);
    server.addConnector(connector);
    
    try {
      server.start();
      server.join();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      server.destroy();
    }
  }
}