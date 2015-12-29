package com.syobochim.kajipoi.dao;

import com.syobochim.kajipoi.core.config.AppConfig;
import com.syobochim.kajipoi.domain.Id;
import com.syobochim.kajipoi.domain.Status;
import com.syobochim.kajipoi.entity.Work;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;

import java.time.LocalDate;
import java.util.List;

@Dao(config = AppConfig.class)
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
