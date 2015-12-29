package com.syobochim.kajipoi.dao;

import com.syobochim.kajipoi.core.config.AppConfig;
import kajipoi.domain.Id;
import com.syobochim.kajipoi.entity.House;
import org.seasar.doma.*;

import java.util.List;

@Dao(config = AppConfig.class)
public interface HouseDao {

    @Select
    List<House> findAll();

    @Select(ensureResult = true)
    House findById(Id houseId);

    @Insert
    int save(House house);

    @Delete
    int delete(House house);
}
