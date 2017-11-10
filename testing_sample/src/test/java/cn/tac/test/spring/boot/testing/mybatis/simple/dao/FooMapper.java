package cn.tac.test.spring.boot.testing.mybatis.simple.dao;

import cn.tac.test.spring.boot.testing.mybatis.simple.pojo.Foo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author tac
 * @since 10/11/2017
 */
@Mapper
public interface FooMapper {
    @Select("SELECT * FROM FOO WHERE bar1 = #{bar1}")
    Foo findByBar1(@Param("bar1") String bar1);
    @Select("SELECT * FROM FOO WHERE id= #{id}")
    Foo findById(@Param("id") Integer id);
}
