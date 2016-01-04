package com.syobochim.kajipoi.entity;

import com.syobochim.kajipoi.domain.SeqId;
import org.seasar.doma.Entity;
import org.seasar.doma.jdbc.entity.NamingType;

/**
 * 家とメンバーを紐付ける居住エンティティ
 *
 * @author syobochim
 */
@Entity(naming = NamingType.LOWER_CASE, immutable = true)
public class Live {

    private final SeqId houseId;

    private final SeqId memberId;

    public Live(SeqId houseId, SeqId memberId) {
        this.houseId = houseId;
        this.memberId = memberId;
    }

    public SeqId getHouseId() {
        return houseId;
    }

    public SeqId getMemberId() {
        return memberId;
    }
}
