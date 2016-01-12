package com.syobochim.kajipoi.entity;

import com.syobochim.kajipoi.domain.Key;
import org.seasar.doma.Entity;
import org.seasar.doma.jdbc.entity.NamingType;

/**
 * 家とメンバーを紐付ける居住エンティティ
 *
 * @author syobochim
 */
@Entity(naming = NamingType.SNAKE_LOWER_CASE, immutable = true)
public class Live {

    private final Key<House> houseId;

    private final Key<Member> memberId;

    public Live(Key<House> houseId, Key<Member> memberId) {
        this.houseId = houseId;
        this.memberId = memberId;
    }

    public Key<House> getHouseId() {
        return houseId;
    }

    public Key<Member> getMemberId() {
        return memberId;
    }
}
