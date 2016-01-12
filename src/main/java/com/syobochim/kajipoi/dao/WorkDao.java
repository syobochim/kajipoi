package com.syobochim.kajipoi.dao;

import com.syobochim.kajipoi.core.config.AppConfig;
import com.syobochim.kajipoi.domain.Key;
import com.syobochim.kajipoi.domain.Status;
import com.syobochim.kajipoi.domain.WorkDate;
import com.syobochim.kajipoi.entity.House;
import com.syobochim.kajipoi.entity.Member;
import com.syobochim.kajipoi.entity.Work;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.jdbc.Result;

import java.util.List;

@Dao(config = AppConfig.class)
public interface WorkDao {

    @Select
    List<Work> findAll();

    @Select(ensureResult = true)
    Work findByMemberId(Key<Member> memberId);

    @Select(ensureResult = true)
    Work findByHouseId(Key<House> houseId);

    @Select
    List<Work> findAllByTerm(WorkDate fromDate, WorkDate toDate);

    @Select
    List<Work> findAllByStatus(Status status);

    @Insert
    Result<Work> save(Work work);

    @Delete
    Result<Work> delete(Work work);
}
