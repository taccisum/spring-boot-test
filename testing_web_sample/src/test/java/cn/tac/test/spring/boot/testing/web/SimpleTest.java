package cn.tac.test.spring.boot.testing.web;

import cn.tac.test.spring.boot.testing.web.common.CommonWebTestingApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author tac
 * @since 10/11/2017
 */
@SpringBootTest(classes = CommonWebTestingApplication.class)
@RunWith(SpringRunner.class)
public class SimpleTest {
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testSimply() {
        System.out.println("hello");
        System.out.println(applicationContext.getClass());
    }
}
