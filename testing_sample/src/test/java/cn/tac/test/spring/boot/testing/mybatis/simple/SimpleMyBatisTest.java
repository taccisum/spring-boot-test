package cn.tac.test.spring.boot.testing.mybatis.simple;

import cn.tac.test.spring.boot.testing.mybatis.simple.dao.FooMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author tac
 * @since 10/11/2017
 */
@RunWith(SpringRunner.class)
@MybatisTest
@ActiveProfiles("mybatis-simple")
public class SimpleMyBatisTest {
    @Autowired
    private FooMapper mapper;

    @Test
    public void testSimply() {
        System.out.println(mapper.findById(1));
        System.out.println(mapper.findByBar1("123"));
    }
}
