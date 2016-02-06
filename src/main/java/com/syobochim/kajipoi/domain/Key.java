package com.syobochim.kajipoi.domain;

import org.seasar.doma.Domain;

import java.util.Objects;

/**
 * Idを表すドメイン
 *
 * @author syobochim
 */
@Domain(valueType = Long.class)
public class Key<ENTITY> {

    private final Long value;

    public Key(Long value) {
        Objects.requireNonNull(value, "key must not be null.");
        this.value = value;
    }

    public Long getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    public static <ENTITY> Key<ENTITY> valueOf(String value) {
        return new Key<>(Long.valueOf(value));
    }
}
