package com.syobochim.kajipoi.entity;

import com.syobochim.kajipoi.domain.Name;
import com.syobochim.kajipoi.domain.SeqId;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.jdbc.entity.NamingType;

/**
 * 家事を表すエンティティクラス
 *
 * @author syobochim
 */
@Entity(naming = NamingType.LOWER_CASE, immutable = true)
public class Housework {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private SeqId houseworkId;

    private Name houseworkName;

    public Housework(SeqId houseworkId, Name houseworkName) {
        this.houseworkId = houseworkId;
        this.houseworkName = houseworkName;
    }

    public SeqId getHouseworkId() {
        return houseworkId;
    }

    public Name getHouseworkName() {
        return houseworkName;
    }
}
