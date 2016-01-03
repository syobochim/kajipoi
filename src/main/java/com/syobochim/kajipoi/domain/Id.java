package com.syobochim.kajipoi.domain;

import org.seasar.doma.Domain;

/**
 * Idを表すドメイン
 *
 * @author syobochim
 */
@Domain(valueType = Integer.class)
public class Id {
    private Integer value;

    public Id(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
