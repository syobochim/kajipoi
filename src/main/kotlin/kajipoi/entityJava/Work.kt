package kajipoi.entityJava

import kajipoi.domain.Id
import kajipoi.domain.Status
import org.seasar.doma.Entity
import org.seasar.doma.jdbc.entity.NamingType

/**
 * @author syobochim
 */
@Entity(naming = NamingType.LOWER_CASE, immutable = true)
class Work(val memberId: Id,
           val houseId: Id,
           val workData: Id,
           val status: Status)