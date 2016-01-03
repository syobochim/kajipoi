package com.syobochim.kajipoi.domain;

import org.seasar.doma.Domain;

/**
 * ステータスを表すドメインクラス。
 *
 * @author syobochim
 */
@Domain(valueType = Integer.class)
public enum Status {
    DOING(0), NOTHING(1), DONE(2);

    private int value;

    private Status(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
