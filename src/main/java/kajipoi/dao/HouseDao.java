package kajipoi.dao;

import kajipoi.domain.Id;
import kajipoi.entity.House;
import org.seasar.doma.*;

import java.util.List;

@Dao
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
