package cn.tac.test.spring.boot.extconfig;

import cn.tac.test.spring.boot.extconfig.common.ExtConfigApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author tac
 * @since 31/10/2017
 */
@SpringBootTest(classes = ExtConfigApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class LocationTest {

    @Value("${from.config}")
    private String fromConfig;

    @Value("${custom.config}")
    private String customConfig;

    @Test
    public void testSimply() {
        System.out.println(fromConfig);
        System.out.println(customConfig);
    }
}
