package cn.tac.test.spring.boot.hsql.mapper;

import cn.tac.test.spring.boot.hsql.pojo.HsqlTest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author tac
 * @since 10/11/2017
 */
@Mapper
public interface HsqlMapper {
    @Select("SELECT * FROM hsql_test WHERE id=#{id}")
    HsqlTest test(Integer id);
}
