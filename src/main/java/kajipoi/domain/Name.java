package kajipoi.domain;

import org.seasar.doma.Domain;

/**
 * 名前をあわらすドメインクラス。
 *
 * @author syobochim
 * @since 1.0
 */
@Domain(valueType = String.class)
public class Name {

    private final String value;

    public Name(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
