package com.syobochim.kajipoi.entity;

import com.syobochim.kajipoi.domain.Name;
import com.syobochim.kajipoi.domain.SeqId;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.jdbc.entity.NamingType;

/**
 * 家のエンティティクラス
 *
 * @author syobochim
 */
@Entity(naming = NamingType.LOWER_CASE, immutable = true)
public class House {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final SeqId houseId;

    private final Name houseName;

    public House(SeqId houseId, Name houseName) {
        this.houseId = houseId;
        this.houseName = houseName;
    }

    public SeqId getHouseId() {
        return houseId;
    }

    public Name getHouseName() {
        return houseName;
    }
}
