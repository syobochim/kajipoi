package com.syobochim.kajipoi.entity;

import com.syobochim.kajipoi.domain.Key;
import com.syobochim.kajipoi.domain.Name;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.jdbc.entity.NamingType;

/**
 * メンバーを表すエンティティクラス
 *
 * @author syobochim
 */
@Entity(naming = NamingType.SNAKE_LOWER_CASE, immutable = true)
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Key<Member> memberId;

    private final Name memberName;

    public Member(Key<Member> memberId, Name memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public Member(Name memberName) {
        this(null, memberName);
    }

    public Key<Member> getMemberId() {
        return memberId;
    }

    public Name getMemberName() {
        return memberName;
    }
}
