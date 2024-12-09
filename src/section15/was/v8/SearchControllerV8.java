package section15.was.v8;

import section15.was.httpserver.HttpRequest;
import section15.was.httpserver.HttpResponse;
import section15.was.httpserver.servlet.annotation.Mapping;

public class SearchControllerV8 {

    @Mapping("/search")
    public void search(HttpRequest request, HttpResponse response) {
        String query = request.getParameter("q");
        response.writeBody("<h1>Search</h1>");
        response.writeBody("<ul>");
        response.writeBody("<li>query:" + query + "</li>");
        response.writeBody("</ul>");
    }
}
