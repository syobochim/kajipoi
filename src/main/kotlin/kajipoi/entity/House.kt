package kajipoi.entity

import kajipoi.domain.Id
import kajipoi.domain.Name
import org.seasar.doma.Entity
import org.seasar.doma.GeneratedValue
import org.seasar.doma.GenerationType
import org.seasar.doma.jdbc.entity.NamingType

/**
 * 家のエンティティクラス
 * @author syobochim
 */
@Entity(naming = NamingType.LOWER_CASE, immutable = true)
class House(@GeneratedValue(strategy = GenerationType.IDENTITY) val houseId: Id,
            val houseName: Name)