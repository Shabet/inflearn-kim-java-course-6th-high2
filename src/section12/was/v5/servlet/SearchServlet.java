package section12.was.v5.servlet;

import section12.was.httpserver.HttpRequest;
import section12.was.httpserver.HttpResponse;
import section12.was.httpserver.HttpServlet;

import java.io.IOException;

public class SearchServlet implements HttpServlet {
    @Override
    public void service(HttpRequest request, HttpResponse response) throws IOException {
        String query = request.getParameter("q");
        response.writeBody("<h1>Search</h1>");
        response.writeBody("<ul>");
        response.writeBody("<li>query:" + query + "</li>");
        response.writeBody("</ul>");
    }
}
