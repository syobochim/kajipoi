package com.syobochim.kajipoi.domain;

import org.seasar.doma.Domain;

import java.time.LocalDate;

/**
 * 家事実施日を表すドメインクラス。
 *
 * @author syobochim
 */
@Domain(valueType = LocalDate.class)
public class WorkDate {

    private final LocalDate value;

    public WorkDate(LocalDate value) {
        this.value = value;
    }

    public LocalDate getValue() {
        return value;
    }
}
