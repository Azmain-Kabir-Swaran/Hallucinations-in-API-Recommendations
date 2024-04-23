package org.example;


import org.eclipse.jetty.http.HttpConnectionFactory;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;

public class Main {
    
    public static void main(String[] args) throws Exception {
        //Create a Server
        Server server = new Server();
        
        //Set up the connectors
        HttpConnectionFactory http = new HttpConnectionFactory();
        ServerConnector serverConnector = new ServerConnector(server, http);
        
        //Start the server
        server.setConnectors(new Connector[]{serverConnector});
        server.start();
        server.join();
    }
}