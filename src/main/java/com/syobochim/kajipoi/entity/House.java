package com.syobochim.kajipoi.entity;

import com.syobochim.kajipoi.domain.Name;
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
@Entity(naming = NamingType.SNAKE_LOWER_CASE, immutable = true)
public class House {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Integer houseId;

    private final Name houseName;

    // 使わない
    public House(Integer houseId, Name houseName) {
        this.houseId = houseId;
        this.houseName = houseName;
    }

    public House(Name houseName) {
        this(null, houseName);
    }

    public Integer getHouseId() {
        return houseId;
    }

    public Name getHouseName() {
        return houseName;
    }
}
