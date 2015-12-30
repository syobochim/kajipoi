package com.syobochim.kajipoi.dao;

import com.syobochim.kajipoi.core.config.AppConfig;
import com.syobochim.kajipoi.domain.Id;
import com.syobochim.kajipoi.entity.Housework;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;

import java.util.List;

@Dao(config = AppConfig.class)
public interface HouseworkDao {

    @Select
    List<Housework> findAll();

    @Select(ensureResult = true)
    Housework findById(Id houseworkId);

    @Insert
    int save(Housework housework);

    @Delete
    int delete(Housework housework);
}
