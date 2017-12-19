package cn.tac.test.spring.boot.transaction.mapper;

import cn.tac.test.spring.boot.transaction.pojo.Foo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author tac
 * @since 05/12/2017
 */
@Mapper
public interface FooMapper {
    @Insert("INSERT INTO foo (id, bar1) VALUES (#{id}, #{bar1})")
    int insert(Foo foo);

    @Select("SELECT * FROM foo WHERE id = #{id}")
    Foo find(String id);
}
