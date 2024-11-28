package section10.chat.server;

import java.io.IOException;

public class ServerMainV2 {

    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {
        SessionManager sessionManager = new SessionManager();

        // CommandManager 점진적으로 변경 예정
        CommandManager commandManager = new CommandManagerV2(sessionManager);

        Server server = new Server(PORT, commandManager, sessionManager);
        server.start();
    }
}
