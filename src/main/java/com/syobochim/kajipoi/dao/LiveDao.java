package com.syobochim.kajipoi.dao;

import com.syobochim.kajipoi.core.config.AppConfig;
import com.syobochim.kajipoi.domain.Key;
import com.syobochim.kajipoi.entity.Live;
import com.syobochim.kajipoi.entity.Member;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.jdbc.Result;

import java.util.List;

@Dao(config = AppConfig.class)
public interface LiveDao {

    @Select
    List<Live> findAll();

    @Select(ensureResult = true)
    Live findByHouseId(Key<Live> houseId);

    @Select(ensureResult = true)
    Live findByMemberId(Key<Member> memberId);

    @Insert
    Result<Live> save(Live live);

    @Delete
    Result<Live> delete(Live live);
}
