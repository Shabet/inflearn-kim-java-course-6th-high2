package section11.was.v5.servlet;

import section11.was.httpserver.HttpRequest;
import section11.was.httpserver.HttpResponse;
import section11.was.httpserver.HttpServlet;

import java.io.IOException;

public class Site1Servlet implements HttpServlet {
    @Override
    public void service(HttpRequest request, HttpResponse response) throws IOException {
        response.writeBody("<h1>site1</h1>");
    }
}
