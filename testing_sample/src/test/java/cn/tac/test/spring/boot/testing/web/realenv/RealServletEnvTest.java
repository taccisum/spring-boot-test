package cn.tac.test.spring.boot.testing.web.realenv;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author tac
 * @since 10/11/2017
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@SpringBootApplication
@RunWith(SpringRunner.class)
public class RealServletEnvTest {
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testSimply() {
        System.out.println("hello");
        System.out.println(applicationContext.getClass());
    }
}
