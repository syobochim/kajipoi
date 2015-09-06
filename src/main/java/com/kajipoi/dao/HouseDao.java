package com.kajipoi.dao;

import com.kajipoi.domain.Id;
import com.kajipoi.domain.Name;
import com.kajipoi.entity.House;
import org.seasar.doma.*;

import java.util.List;

@Dao
public interface HouseDao {

    @Select
    List<House> findAll();

    @Select(ensureResult = true)
    House findById(Id houseId);

    @Select(ensureResult = true)
    House findByHouseName(Name houseName);

    @Insert
    int save(House house);

    @Delete
    int delete(House house);
}
