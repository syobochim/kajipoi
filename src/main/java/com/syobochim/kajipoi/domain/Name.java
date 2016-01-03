package com.syobochim.kajipoi.domain;

import org.seasar.doma.Domain;

/**
 * 名前をあわらすドメインクラス。
 *
 * @author syobochim
 */
@Domain(valueType = String.class)
public class Name {
    private String value;

    public Name(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
