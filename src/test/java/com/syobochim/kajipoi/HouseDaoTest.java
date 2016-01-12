package com.syobochim.kajipoi;

import com.syobochim.kajipoi.core.config.DomaConfig;
import com.syobochim.kajipoi.dao.HouseDao;
import com.syobochim.kajipoi.dao.HouseDaoImpl;
import com.syobochim.kajipoi.domain.Name;
import com.syobochim.kajipoi.entity.House;
import org.junit.Test;
import org.seasar.doma.jdbc.Result;
import org.seasar.doma.jdbc.tx.TransactionManager;

/**
 * @author syobochim
 */
public class HouseDaoTest {

    @Test
    public void HouseDaoにデータを入れてみる() throws Exception {
        TransactionManager tm = DomaConfig.singleton().getTransactionManager();

        HouseDao dao = new HouseDaoImpl();
        tm.required(() -> {
            House house = new House(new Name("hoge"));
            Result<House> result = dao.save(house);
            House entity = result.getEntity();
        });

    }
}
