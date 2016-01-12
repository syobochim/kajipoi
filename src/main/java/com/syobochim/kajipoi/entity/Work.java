package com.syobochim.kajipoi.entity;

import com.syobochim.kajipoi.domain.Key;
import com.syobochim.kajipoi.domain.Status;
import com.syobochim.kajipoi.domain.WorkDate;
import org.seasar.doma.Entity;
import org.seasar.doma.jdbc.entity.NamingType;

/**
 * メンバーが実施したお仕事の記録用エンティティ
 *
 * @author syobochim
 */
@Entity(naming = NamingType.SNAKE_LOWER_CASE, immutable = true)
public class Work {

    private final Key<Member> memberId;

    private final Key<Housework> houseworkId;

    private final Status status;

    private final WorkDate workDate;

    public Work(Key<Member> memberId, Key<Housework> houseworkId, Status status, WorkDate workDate) {
        this.memberId = memberId;
        this.houseworkId = houseworkId;
        this.status = status;
        this.workDate = workDate;
    }

    public Key<Member> getMemberId() {
        return memberId;
    }

    public Key<Housework> getHouseworkId() {
        return houseworkId;
    }

    public Status getStatus() {
        return status;
    }

    public WorkDate getWorkDate() {
        return workDate;
    }
}
