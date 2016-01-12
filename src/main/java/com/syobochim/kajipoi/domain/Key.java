package com.syobochim.kajipoi.domain;

import org.seasar.doma.Domain;

/**
 * Idを表すドメイン
 *
 * @author syobochim
 */
@Domain(valueType = Long.class)
public class Key<ENTITY> {

    private final Long value;

    public Key(Long value) {
        this.value = value;
    }

    public Key<ENTITY> setValue(Long value) {
        return new Key<>(value);
    }

    public Long getValue() {
        return value;
    }
}
