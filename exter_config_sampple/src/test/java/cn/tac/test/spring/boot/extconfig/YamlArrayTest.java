package cn.tac.test.spring.boot.extconfig;

import cn.tac.test.spring.boot.extconfig.common.ExtConfigApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

/**
 * @author tac
 * @since 31/10/2017
 */
@SpringBootTest(classes = ExtConfigApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class YamlArrayTest {
    @Value("${arr.yaml.foo[0]}")
    private String foo0;
    @Value("${arr.yaml.foo[1]}")
    private String foo1;
    @Value("${arr.yaml.foo[2]}")
    private String foo2;

    @Test
    public void testSimply() {
        System.out.println(foo0);
        System.out.println(foo1);
        System.out.println(foo2);
    }
}
