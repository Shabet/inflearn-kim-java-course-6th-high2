package section13.was.httpserver.servlet;

import section13.was.httpserver.HttpRequest;
import section13.was.httpserver.HttpResponse;
import section13.was.httpserver.HttpServlet;

public class DiscardServlet implements HttpServlet {
    @Override
    public void service(HttpRequest request, HttpResponse response) {
        // empty
    }
}
