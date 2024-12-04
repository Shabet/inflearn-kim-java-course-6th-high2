package section11.was.httpserver.servlet;

import section11.was.httpserver.HttpRequest;
import section11.was.httpserver.HttpResponse;
import section11.was.httpserver.HttpServlet;

public class NotFoundServlet implements HttpServlet {
    @Override
    public void service(HttpRequest request, HttpResponse response) {
        response.setStatusCode(404);
        response.writeBody("<h1>404 페이지를 찾을 수 없습니다.</h1>");
    }
}
