package com.syobochim.kajipoi.entity;

import com.syobochim.kajipoi.domain.Key;
import com.syobochim.kajipoi.domain.Name;
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
@Entity(naming = NamingType.SNAKE_LOWER_CASE, immutable = true)
public class Housework {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Key<Housework> houseworkId;

    private final Name houseworkName;

    public Housework(Key<Housework> houseworkId, Name houseworkName) {
        this.houseworkId = houseworkId;
        this.houseworkName = houseworkName;
    }

    public Housework(Name houseworkName) {
        this(null, houseworkName);
    }

    public Key<Housework> getHouseworkId() {
        return houseworkId;
    }

    public Name getHouseworkName() {
        return houseworkName;
    }
}
