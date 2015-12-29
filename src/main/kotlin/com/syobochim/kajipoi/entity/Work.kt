package com.syobochim.kajipoi.entity

import com.syobochim.kajipoi.domain.Id
import com.syobochim.kajipoi.domain.Status
import com.syobochim.kajipoi.domain.WorkDate
import org.seasar.doma.Entity
import org.seasar.doma.jdbc.entity.NamingType

/**
 * メンバーがやったお仕事の記録用テーブル
 * @author syobochim
 */
@Entity(naming = NamingType.LOWER_CASE, immutable = true)
class Work(val memberId: Id,
           val houseworkId: Id,
           val status: Status,
           val workDate: WorkDate)