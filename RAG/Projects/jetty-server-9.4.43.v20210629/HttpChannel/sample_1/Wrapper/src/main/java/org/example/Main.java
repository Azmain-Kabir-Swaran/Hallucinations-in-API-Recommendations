package org.example;


import java.net.InetSocketAddress;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.bio.SocketConnector;
import org.eclipse.jetty.server.handler.AbstractHandler;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.server.handler.ContextHandlerCollection;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.server.session.SessionHandler;
import org.eclipse.jetty.util.resource.Resource;
import org.eclipse.jetty.util.resource.ResourceCollection;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import org.eclipse.jetty.util.resource.PathResource;
import java.io.File;
import java.util.Properties;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.jetty.http.HttpGenerator;

public class Main {

    public static void main(String[] args) throws Exception {
        Server server = new Server();

        server.addConnector(new SocketConnector(new InetSocketAddress(8080)));

        ContextHandler context = new ContextHandler();
        context.setContextPath("/");
        context.setHandler(new AbstractHandler() {

            @Override
            public void handle(String target, HttpChannel channel, Properties props) throws IOException {
                channel.sendResponseHeaders(HttpGenerator.StatusCode.OK, "text/plain");
                channel.sendContent(new ByteBuffer("Hello, World!"));
            }
        });

        SessionHandler sessions = new SessionHandler();
        sessions.setHandler(context);

        ResourceHandler resourceHandler = new ResourceHandler();
        resourceHandler.setResourceBase(new File(".").getAbsolutePath());

        ResourceCollection staticResources = new ResourceCollection(
                new PathResource(new File(".").getAbsolutePath()));
        resourceHandler.setBaseResource(staticResources);

        ContextHandlerCollection contexts = new ContextHandlerCollection();
        contexts.setHandlers(new Handler[]{resourceHandler, sessions});

        server.setHandler(contexts);

        server.start();
        server.join();
    }
}