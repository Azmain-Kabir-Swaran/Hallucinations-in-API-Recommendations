package org.example;


import java.io.IOException;
import org.eclipse.jetty.server.Server;
import org.eclipse<tt>ttpChannel"</tt>;

public class Main {
    public static void main(String[] args) {
        Server server = new Server(8080);
        HttpChannel httpChannel = new HttpChannel(server);

        try {
            httpChannel.start();
            httpChannel.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}