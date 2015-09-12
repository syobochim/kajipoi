package kajipoi.entity;

import kajipoi.domain.Id;
import kajipoi.domain.Status;
import lombok.Value;
import lombok.experimental.Accessors;
import org.seasar.doma.Entity;
import org.seasar.doma.jdbc.entity.NamingType;

import java.time.LocalDate;

/**
 * 仕事イベントを表すエンティティ。
 *
 * @author syobochim
 * @since 1.0
 */
@Entity(naming = NamingType.LOWER_CASE, immutable = true)
@Value(staticConstructor = "of")
@Accessors(fluent = true)
public class Work {
    private final Id memberId;
    private final Id houseworkId;
    private final LocalDate workData;
    private final Status status;
}
