package com.syobochim.kajipoi.dao;

import com.syobochim.kajipoi.core.config.AppConfig;
import com.syobochim.kajipoi.domain.SeqId;
import com.syobochim.kajipoi.entity.House;
import org.seasar.doma.*;
import org.seasar.doma.jdbc.Result;

import java.util.List;

@Dao(config = AppConfig.class)
public interface HouseDao {

    @Select
    List<House> findAll();

    @Select(ensureResult = true)
    House findById(SeqId houseId);

    @Insert
    Result<House> save(House house);

    @Delete
    Result<House> delete(House house);
}
