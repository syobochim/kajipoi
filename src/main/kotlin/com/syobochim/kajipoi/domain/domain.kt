package com.syobochim.kajipoi.domain

import org.seasar.doma.Domain
import java.util.*

/**
 * Idを表すドメイン
 */
@Domain(valueType = Int::class)
class Id(val value: Int)

/**
 * 名前をあわらすドメインクラス。
 */
@Domain(valueType = String::class)
class Name(val value: String)

/**
 * ステータスを表すドメインクラス。
 */
@Domain(valueType = Int::class)
enum class Status(val value: Int) {
    DOING(0), NOTHING(1), DONE(2)
}

/**
 * 家事実施日を表すドメインクラス。
 */
@Domain(valueType = Date::class)
class WorkDate(val value: Date)
