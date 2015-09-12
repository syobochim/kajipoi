package kajipoi.dao;

import kajipoi.domain.Id;
import kajipoi.domain.Status;
import kajipoi.entity.Work;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;

import java.time.LocalDate;
import java.util.List;

public interface WorkDao {

    @Select
    List<Work> findAll();

    @Select(ensureResult = true)
    Work findByMemberId(Id memberId);

    @Select(ensureResult = true)
    Work findByHouseId(Id houseId);

    @Select
    List<Work> findAllByTerm(LocalDate fromDate, LocalDate toData);

    @Select
    List<Work> findAllByStatus(Status status);

    @Insert
    int save(Work work);

    @Delete
    int delete(Work work);
}