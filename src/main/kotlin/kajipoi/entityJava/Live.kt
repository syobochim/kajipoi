package kajipoi.entityJava

import kajipoi.domain.Id
import org.seasar.doma.Entity
import org.seasar.doma.jdbc.entity.NamingType

/**
 * @author syobochim
 */
@Entity(naming = NamingType.LOWER_CASE, immutable = true)
class Live(val houseId: Id, val memberId: Id)
