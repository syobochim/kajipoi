package kajipoi.entity;

import kajipoi.domain.Name;
import lombok.Value;
import lombok.experimental.Accessors;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.jdbc.entity.NamingType;

/**
 * メンバーリソースを表すエンティティ。
 *
 * @author syobochim
 * @since 1.0
 */
@Entity(naming = NamingType.LOWER_CASE, immutable = true)
@Value(staticConstructor = "of")
@Accessors(fluent = true)
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Id memberId;

    private final Name memberName;
}
