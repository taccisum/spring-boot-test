package cn.tac.test.spring.boot.redis.caching.service;

import cn.tac.test.spring.boot.redis.caching.CachingRedisApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

import static org.junit.Assert.*;

/**
 * @author tac
 * @since 08/11/2017
 */
@SpringBootTest(classes = CachingRedisApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class FooServiceTest {
    @Autowired
    private FooService service;

    @Test
    public void getFoo() throws Exception {
        String id = UUID.randomUUID().toString();
        System.out.println(service.getFoo(id));
        System.out.println(service.getFoo(id));
        System.out.println(service.getFoo(id));
        System.out.println(service.getFoo(UUID.randomUUID().toString()));
    }
}
