package section11.was.httpserver.servlet;

import section11.was.httpserver.HttpRequest;
import section11.was.httpserver.HttpResponse;
import section11.was.httpserver.HttpServlet;

public class DiscardServlet implements HttpServlet {
    @Override
    public void service(HttpRequest request, HttpResponse response) {
        // empty
    }
}
