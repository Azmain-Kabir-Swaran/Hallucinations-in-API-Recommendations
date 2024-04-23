package org.example;


import org.eclipse.jetty.server.Server;
import org.eclipsetty.server.handler.AbstractHandler;

public class Main extends AbstractHandler {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        server.setHandler(new Main());

        server.start();
        server.join();
    }

    @Override
    public void handle(String target, org.eclipse.jetty.server.Request baseRequest, org.eclipse.jetty.http.HttpServletRequest request, org.eclipse.jetty.http.HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
        baseRequest.setHandled(true);
        response.getWriter().println("Hello from Jetty WebServer by @nchikasar");
    }
}