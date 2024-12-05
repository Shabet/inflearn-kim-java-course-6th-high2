package section15.was.v7;

import section15.was.httpserver.HttpServer;
import section15.was.httpserver.HttpServlet;
import section15.was.httpserver.ServletManager;
import section15.was.httpserver.servlet.DiscardServlet;
import section15.was.httpserver.servlet.annotation.AnnotationServletV1;

import java.io.IOException;
import java.util.List;

public class ServerMainV7 {

    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {
        List<Object> controllers = List.of(new SiteControllerV7(), new SearchControllerV7());
        HttpServlet annotationServlet = new AnnotationServletV1(controllers);

        ServletManager servletManager = new ServletManager();
        servletManager.setDefaultServlet(annotationServlet);
        servletManager.add("/favicon.ico", new DiscardServlet());

        HttpServer server = new HttpServer(PORT, servletManager);
        server.start();
    }
}
