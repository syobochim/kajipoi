package com.kajipoi.entity;

import com.kajipoi.domain.Id;
import com.kajipoi.domain.Status;
import lombok.Data;
import org.seasar.doma.Entity;
import org.seasar.doma.jdbc.entity.NamingType;

import java.time.LocalDate;

/**
 * 仕事イベントを表すエンティティ。
 *
 * @author syobochim
 * @since 1.0
 */
@Entity(naming = NamingType.LOWER_CASE)
@Data
public class Work {
    private Id memberId;
    private Id houseworkId;
    private LocalDate workData;

    private Status status;
}
