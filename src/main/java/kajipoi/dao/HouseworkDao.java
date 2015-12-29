package kajipoi.dao;

import kajipoi.core.config.AppConfig;
import kajipoi.domain.Id;
import kajipoi.entity.Housework;
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
