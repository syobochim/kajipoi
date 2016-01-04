package com.syobochim.kajipoi.domain;

import org.seasar.doma.Domain;

/**
 * Idを表すドメイン
 *
 * @author syobochim
 */
@Domain(valueType = Integer.class)
public class SeqId {
    private Integer value;

    public SeqId(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
