package section12.was.v5.servlet;

import section12.was.httpserver.HttpRequest;
import section12.was.httpserver.HttpResponse;
import section12.was.httpserver.HttpServlet;

import java.io.IOException;

public class Site1Servlet implements HttpServlet {
    @Override
    public void service(HttpRequest request, HttpResponse response) throws IOException {
        response.writeBody("<h1>site1</h1>");
    }
}
