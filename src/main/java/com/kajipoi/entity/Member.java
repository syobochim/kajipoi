package com.kajipoi.entity;

import com.kajipoi.domain.Name;
import lombok.Data;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.jdbc.entity.NamingType;

/**
 * メンバーリソースを表すエンティティ。
 *
 * @author syobochim
 * @since 1.0
 */
@Entity(naming = NamingType.LOWER_CASE)
@Data
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Id memberId;

    private Name memberName;
}
