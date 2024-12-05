package section13.was.httpserver.servlet.reflection;

import section13.was.httpserver.HttpRequest;
import section13.was.httpserver.HttpResponse;
import section13.was.httpserver.HttpServlet;
import section13.was.httpserver.PageNotFoundException;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class ReflectionServlet implements HttpServlet {

    private final List<Object> controllers;

    public ReflectionServlet(List<Object> controllers) {
        this.controllers = controllers;
    }

    @Override
    public void service(HttpRequest request, HttpResponse response) throws IOException {
        String path = request.getPath();

        // SiteControllerV6, SearchControllerV6
        for (Object controller : controllers) {
            // SiteControllerV6
            Class<?> aClass = controller.getClass();
            Method[] methods = aClass.getDeclaredMethods();
            // site1, site2
            for (Method method : methods) {
                String methodName = method.getName();
                if (path.equals("/" + methodName)) { // /site1
                    invoke(controller, method, request, response);
                    return;
                }
            }
        }
        throw new PageNotFoundException("request = " + path);
    }

    private static void invoke(Object controller, Method method, HttpRequest request, HttpResponse response) {
        try {
            method.invoke(controller, request, response);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}