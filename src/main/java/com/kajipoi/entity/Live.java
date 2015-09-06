package com.kajipoi.entity;

import com.kajipoi.domain.Id;
import lombok.Value;
import lombok.experimental.Accessors;
import org.seasar.doma.Entity;
import org.seasar.doma.jdbc.entity.NamingType;

/**
 * 居住イベントを表すエンティティ。
 *
 * @author syobochim
 * @since 1.0
 */
@Entity(naming = NamingType.LOWER_CASE, immutable = true)
@Value(staticConstructor = "of")
@Accessors(fluent = true)
public class Live {
    private final Id houseId;
    private final Id memberId;
}
