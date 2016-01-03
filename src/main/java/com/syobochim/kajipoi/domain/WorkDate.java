package com.syobochim.kajipoi.domain;

import org.seasar.doma.Domain;
import sun.jvm.hotspot.memory.LoaderConstraintEntry;

import java.time.LocalDate;

/**
 * 家事実施日を表すドメインクラス。
 *
 * @author syobochim
 */
@Domain(valueType = LocalDate.class)
public class WorkDate {

    private LocalDate value;

    public WorkDate(LocalDate value) {
        this.value = value;
    }

    public LocalDate getValue() {
        return value;
    }
}
