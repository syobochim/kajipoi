package kajipoi.domain

import org.seasar.doma.Domain
import java.util.*

/**
 * Idを表すドメイン
 *
 * @author syobochim
 * @since 1.0
 */
@Domain(valueType = String::class)
class Id(val value: String)

/**
 * 名前をあわらすドメインクラス。
 *
 * @author syobochim
 * @since 1.0
 */
@Domain(valueType = String::class)
class Name(val value: String)

/**
 * ステータスを表すドメインクラス。
 *
 * @author syobochim
 * @since 1.0
 */
@Domain(valueType = Int::class)
enum class Status(val value: Int) {
    DOING(0), NOTHING(1), DONE(2)
}
