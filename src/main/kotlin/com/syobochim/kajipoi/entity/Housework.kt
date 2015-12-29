package com.syobochim.kajipoi.entity

import com.syobochim.kajipoi.domain.Id
import com.syobochim.kajipoi.domain.Name
import org.seasar.doma.Entity
import org.seasar.doma.GeneratedValue
import org.seasar.doma.GenerationType
import org.seasar.doma.jdbc.entity.NamingType

/**
 * @author syobochim
 */
@Entity(naming = NamingType.LOWER_CASE, immutable = true)
class Housework(@GeneratedValue(strategy = org.seasar.doma.GenerationType.IDENTITY) val houseworkId: Id,
                val houseworkName: Name)

