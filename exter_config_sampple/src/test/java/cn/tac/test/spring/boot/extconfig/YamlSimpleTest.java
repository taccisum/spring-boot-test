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
public class YamlSimpleTest {
    @Value("${simple.yaml.foo1}")
    private String foo1;
    @Value("${simple.yaml.foo2}")
    private String foo2;

    @Test
    public void testSimply() {
        System.out.println(foo1);
        System.out.println(foo2);
    }
}
