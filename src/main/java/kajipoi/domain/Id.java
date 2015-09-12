package kajipoi.domain;

import java.math.BigInteger;

/**
 * Idを表すドメイン
 *
 * @author syobochim
 * @since 1.0
 */
public class Id {
    private final BigInteger value;

    public Id(BigInteger value) {
        this.value = value;
    }

    public BigInteger getValue() {
        return value;
    }
}
