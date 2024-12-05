package section13.was.V6;

import section13.was.httpserver.HttpRequest;
import section13.was.httpserver.HttpResponse;

public class SearchControllerV6 {

    public void search(HttpRequest request, HttpResponse response) {
        String query = request.getParameter("q");
        response.writeBody("<h1>Search</h1>");
        response.writeBody("<ul>");
        response.writeBody("<li>query:" + query + "</li>");
        response.writeBody("</ul>");
    }
}
