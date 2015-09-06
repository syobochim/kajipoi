package com.kajipoi.dao;

import com.kajipoi.domain.Id;
import com.kajipoi.entity.Housework;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;

import java.util.List;

@Dao
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
