package com.kajipoi.dao;

import com.kajipoi.domain.Id;
import com.kajipoi.entity.Live;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;

import java.util.List;

@Dao
public interface LiveDao {

    @Select
    List<Live> findAll();

    @Select(ensureResult = true)
    Live findByHouseId(Id houseId);

    @Select(ensureResult = true)
    Live findByMemberId(Id memberId);

    @Insert
    int save(Live live);

    @Delete
    int delete(Live live);
}
