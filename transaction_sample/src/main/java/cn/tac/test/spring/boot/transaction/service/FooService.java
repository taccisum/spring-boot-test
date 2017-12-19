package cn.tac.test.spring.boot.transaction.service;

import cn.tac.test.spring.boot.transaction.mapper.FooMapper;
import cn.tac.test.spring.boot.transaction.pojo.Foo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author tac
 * @since 05/12/2017
 */
@Service
public class FooService {
    @Autowired
    private FooMapper mapper;

    public int insert(Foo foo) {
        return mapper.insert(foo);
    }
}
