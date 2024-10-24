package section09.network.tcp.v5;

import section09.network.tcp.v4.SessionV4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static util.MyLogger.log;

/*
 * ServerV4와 동일
 */
public class ServerV5 {

    public static final int PORT = 12345;

    public static void main(String[] args) throws IOException {

        log("서버 시작");
        ServerSocket serverSocket = new ServerSocket(PORT);
        log("서버 소켓 시작 - 리스팅 포트: " + PORT);

        while (true) {
            Socket socket = serverSocket.accept();// 블로킹
            log("소켓 연결: " + socket);

            SessionV5 session = new SessionV5(socket);
            Thread thread = new Thread(session);
            thread.start();
        }

    }
}
