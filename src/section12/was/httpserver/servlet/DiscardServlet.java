package section12.was.httpserver.servlet;

import section12.was.httpserver.HttpRequest;
import section12.was.httpserver.HttpResponse;
import section12.was.httpserver.HttpServlet;

public class DiscardServlet implements HttpServlet {
    @Override
    public void service(HttpRequest request, HttpResponse response) {
        // empty
    }
}
