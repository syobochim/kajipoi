package com.syobochim.kajipoi.domain;

import org.seasar.doma.Domain;

import java.util.Objects;
import java.util.Optional;

/**
 * 名前をあわらすドメインクラス。
 *
 * @author syobochim
 */
@Domain(valueType = String.class)
public class Name {
    private final String value;

    public Name(String value) {
        Objects.requireNonNull(value, "name must not be null");
        if (value.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static Name valueOf(String value) {
        return Optional.ofNullable(value).filter(a -> !a.isEmpty()).map(Name::new).orElse(null);
    }

}
