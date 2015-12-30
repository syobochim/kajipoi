package com.syobochim.kajipoi.dao;

import com.syobochim.kajipoi.core.config.AppConfig;
import com.syobochim.kajipoi.domain.Id;
import com.syobochim.kajipoi.entity.Live;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;

import java.util.List;

@Dao(config = AppConfig.class)
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
