package section15.was.v8;

import section15.was.httpserver.HttpServer;
import section15.was.httpserver.HttpServlet;
import section15.was.httpserver.ServletManager;
import section15.was.httpserver.servlet.DiscardServlet;
import section15.was.httpserver.servlet.annotation.AnnotationServletV2;

import java.io.IOException;
import java.util.List;

public class ServerMainV8 {

    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {
        List<Object> controllers = List.of(new SiteControllerV8(), new SearchControllerV8());
        HttpServlet annotationServlet = new AnnotationServletV2(controllers);

        ServletManager servletManager = new ServletManager();
        servletManager.setDefaultServlet(annotationServlet);
        servletManager.add("/favicon.ico", new DiscardServlet());

        HttpServer server = new HttpServer(PORT, servletManager);
        server.start();
    }
}
