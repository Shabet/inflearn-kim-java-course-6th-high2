package section05.io.member;

import java.util.List;

public interface MemberRepository {
    void addMember(Member member);

    List<Member> findAll();
}
