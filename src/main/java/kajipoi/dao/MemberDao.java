package kajipoi.dao;

import kajipoi.domain.Id;
import kajipoi.entity.Member;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;

import java.util.List;

@Dao
public interface MemberDao {

    @Select
    List<Member> findAll();

    @Select(ensureResult = true)
    Member findById(Id memberId);

    @Insert
    int save(Member member);

    @Delete
    int delete(Member member);
}
