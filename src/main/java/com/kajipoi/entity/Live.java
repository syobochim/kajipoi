package com.kajipoi.entity;

import com.kajipoi.domain.Id;
import lombok.Builder;
import lombok.Data;
import org.seasar.doma.Entity;

/**
 * 居住イベントを表すエンティティ。
 *
 * @author syobochim
 * @since 1.0
 */
@Entity
@Builder
@Data
public class Live {
    private Id houseId;
    private Id memberId;
}
