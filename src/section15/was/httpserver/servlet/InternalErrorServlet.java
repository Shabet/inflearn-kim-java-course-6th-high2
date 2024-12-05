package section15.was.httpserver.servlet;

import section15.was.httpserver.HttpRequest;
import section15.was.httpserver.HttpResponse;
import section15.was.httpserver.HttpServlet;

public class InternalErrorServlet implements HttpServlet {
    @Override
    public void service(HttpRequest request, HttpResponse response) {
        response.setStatusCode(500);
        response.writeBody("<h1>Internal Error</h1>");
    }
}
