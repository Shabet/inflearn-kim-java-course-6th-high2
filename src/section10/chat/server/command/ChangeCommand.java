package section10.chat.server.command;

import section10.chat.server.Session;
import section10.chat.server.SessionManager;

public class ChangeCommand implements Command {

    private final SessionManager sessionManager;

    public ChangeCommand(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
    }

    @Override
    public void execute(String[] args, Session session) {
        String changeName = args[1];
        sessionManager.sendAll(changeName + "님이 " + changeName + "(으)로 이름을 변경했습니다.");
        session.setUsername(changeName);
    }
}
