package kajipoi.entity

import kajipoi.domain.Id
import kajipoi.domain.Name
import org.seasar.doma.Entity
import org.seasar.doma.GeneratedValue
import org.seasar.doma.GenerationType
import org.seasar.doma.jdbc.entity.NamingType

/**
 * @author syobochim
 */
@Entity(naming = NamingType.LOWER_CASE, immutable = true)
class Member(@GeneratedValue(strategy = GenerationType.IDENTITY) val memberId: Id,
             val memberName: Name)