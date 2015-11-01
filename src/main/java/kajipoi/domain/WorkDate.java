package kajipoi.domain;

import org.seasar.doma.Domain;

import java.time.LocalDate;

/**
 * 家事をした日を表すドメイン
 *
 * @author syobochim
 */
@Domain(valueType = LocalDate.class)
public class WorkDate {
    private final LocalDate value;

    public WorkDate(LocalDate value) {
        this.value = value;
    }

    LocalDate getValue() {
        return value;
    }
}
