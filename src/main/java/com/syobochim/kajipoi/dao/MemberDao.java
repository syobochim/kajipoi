package com.syobochim.kajipoi.dao;

import com.syobochim.kajipoi.core.config.DomaConfig;
import com.syobochim.kajipoi.domain.Key;
import com.syobochim.kajipoi.entity.Member;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.jdbc.Result;

import java.util.List;

@Dao(config = DomaConfig.class)
public interface MemberDao {

    @Select
    List<Member> findAll();

    @Select(ensureResult = true)
    Member findById(Key<Member> memberId);

    @Insert
    Result<Member> save(Member member);

    @Delete
    Result<Member> delete(Member member);
}
