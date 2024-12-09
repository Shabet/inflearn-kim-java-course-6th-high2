package section15.webservice;

import section05.io.member.MemberRepository;
import section05.io.member.impl.FileMemberRepository;
import section05.io.member.impl.MemoryMemberRepository;
import section15.was.httpserver.HttpServer;
import section15.was.httpserver.HttpServlet;
import section15.was.httpserver.ServletManager;
import section15.was.httpserver.servlet.DiscardServlet;
import section15.was.httpserver.servlet.annotation.AnnotationServletV3;

import java.io.IOException;
import java.util.List;

public class MemberServiceMain2 {

    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {
        MemberRepository memberRepository = new MemoryMemberRepository(); // 여기 수정
        MemberController memberController = new MemberController(memberRepository);
        HttpServlet servlet = new AnnotationServletV3(List.of(memberController));
        ServletManager servletManager = new ServletManager();
        servletManager.add("/favicon.ico", new DiscardServlet());
        servletManager.setDefaultServlet(servlet);

        HttpServer server = new HttpServer(PORT, servletManager);
        server.start();
    }
}
