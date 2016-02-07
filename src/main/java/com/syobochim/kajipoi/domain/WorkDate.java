package com.syobochim.kajipoi.domain;

import org.seasar.doma.Domain;

import java.time.LocalDate;
import java.util.Objects;

/**
 * 家事実施日を表すドメインクラス。
 *
 * @author syobochim
 */
@Domain(valueType = LocalDate.class)
public class WorkDate {

    private final LocalDate value;

    public WorkDate(LocalDate value) {
        Objects.requireNonNull(value, "workDate must not be null");
        this.value = value;
    }

    public LocalDate getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    public static WorkDate valueOf(String text) {
        return new WorkDate(LocalDate.parse(text));
    }
}
