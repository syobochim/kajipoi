package com.syobochim.kajipoi.entity;

import com.syobochim.kajipoi.domain.SeqId;
import com.syobochim.kajipoi.domain.Status;
import com.syobochim.kajipoi.domain.WorkDate;
import org.seasar.doma.Entity;
import org.seasar.doma.jdbc.entity.NamingType;

/**
 * メンバーが実施したお仕事の記録用エンティティ
 *
 * @author syobochim
 */
@Entity(naming = NamingType.LOWER_CASE, immutable = true)
public class Work {

    private final SeqId memberId;

    private final SeqId houseworkId;

    private final Status status;

    private final WorkDate workDate;

    public Work(SeqId memberId, SeqId houseworkId, Status status, WorkDate workDate) {
        this.memberId = memberId;
        this.houseworkId = houseworkId;
        this.status = status;
        this.workDate = workDate;
    }

    public SeqId getMemberId() {
        return memberId;
    }

    public SeqId getHouseworkId() {
        return houseworkId;
    }

    public Status getStatus() {
        return status;
    }

    public WorkDate getWorkDate() {
        return workDate;
    }
}
