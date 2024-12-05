package section13.was.V6;

import section13.was.V6.servlet.HomeServlet;
import section13.was.httpserver.HttpServer;
import section13.was.httpserver.ServletManager;
import section13.was.httpserver.servlet.DiscardServlet;
import section13.was.httpserver.servlet.reflection.ReflectionServlet;

import java.io.IOException;
import java.util.List;

public class ServerMainV6 {

    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {
        List<Object> controllers = List.of(new SiteControllerV6(), new SearchControllerV6());
        ReflectionServlet reflectionServlet = new ReflectionServlet(controllers);

        ServletManager servletManager = new ServletManager();
        servletManager.setDefaultServlet(reflectionServlet);
        servletManager.add("/", new HomeServlet());
        servletManager.add("/favicon.ico", new DiscardServlet());

        HttpServer server = new HttpServer(PORT, servletManager);
        server.start();
    }
}
