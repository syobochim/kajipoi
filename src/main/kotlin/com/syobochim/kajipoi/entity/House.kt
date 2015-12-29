package com.syobochim.kajipoi.entity

import com.syobochim.kajipoi.domain.Id
import com.syobochim.kajipoi.domain.Name
import org.seasar.doma.Entity
import org.seasar.doma.GeneratedValue
import org.seasar.doma.jdbc.entity.NamingType

/**
 * 家のエンティティクラス
 * @author syobochim
 */
@Entity(naming = NamingType.LOWER_CASE, immutable = true)
class House(@GeneratedValue(strategy = org.seasar.doma.GenerationType.IDENTITY) val houseId: Id,
            val houseName: Name)