package com.syobochim.kajipoi.domain;

import org.seasar.doma.Domain;

import java.util.Arrays;

/**
 * ステータスを表すドメインクラス。
 *
 * @author syobochim
 */
@Domain(valueType = Integer.class, factoryMethod = "of")
public enum Status {
    DOING(0), NOTHING(1), DONE(2);

    private int value;

    private Status(int value) {
        this.value = value;
    }

    public static Status of(int value) {
        return Arrays.stream(Status.values())
                .filter(status -> status.getValue() == value)
                .findAny()
                .orElseThrow(IllegalArgumentException::new);
    }

    public int getValue() {
        return value;
    }
}
