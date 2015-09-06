package com.kajipoi.entity;

import com.kajipoi.domain.Name;
import lombok.Value;
import lombok.experimental.Accessors;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.jdbc.entity.NamingType;

/**
 * 家事リソースを表すエンティティ。
 *
 * @author syobochim
 * @since 1.0
 */
@Entity(naming = NamingType.LOWER_CASE, immutable = true)
@Value(staticConstructor = "of")
@Accessors(fluent = true)
public class Housework {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Id houseworkId;

    private final Name houseworkName;
}
