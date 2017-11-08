package cn.tac.test.spring.boot.redis.caching.service;

import cn.tac.test.spring.boot.redis.caching.pojo.CachingFoo;
import io.codearte.jfairy.Fairy;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author tac
 * @since 08/11/2017
 */
@Service
public class FooService {
    private Fairy fairy = Fairy.create();

    @Cacheable(value = "foo", keyGenerator = "keyGenerator")
//    @Cacheable(value = "foo", key = "'foo:' + #id")
    public CachingFoo getFoo(String id) {
        CachingFoo foo = new CachingFoo(id);
        foo.setBar1(fairy.textProducer().randomString(5) + "哈哈");
        foo.setBar2(fairy.baseProducer().randomInt(100000));
        return foo;
    }
}
