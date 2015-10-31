package kajipoi.entityJava

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
class Housework(@GeneratedValue(strategy = GenerationType.IDENTITY) val houseworkId: Id,
                val houseworkName: Name)

