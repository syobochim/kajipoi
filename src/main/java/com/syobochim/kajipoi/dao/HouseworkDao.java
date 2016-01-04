package com.syobochim.kajipoi.dao;

import com.syobochim.kajipoi.core.config.AppConfig;
import com.syobochim.kajipoi.domain.SeqId;
import com.syobochim.kajipoi.entity.Housework;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.jdbc.Result;

import java.util.List;

@Dao(config = AppConfig.class)
public interface HouseworkDao {

    @Select
    List<Housework> findAll();

    @Select(ensureResult = true)
    Housework findById(SeqId houseworkId);

    @Insert
    Result<Housework> save(Housework housework);

    @Delete
    Result<Housework> delete(Housework housework);
}
