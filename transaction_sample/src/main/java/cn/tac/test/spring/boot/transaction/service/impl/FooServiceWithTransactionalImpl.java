package cn.tac.test.spring.boot.transaction.service.impl;

import cn.tac.test.spring.boot.transaction.mapper.FooMapper;
import cn.tac.test.spring.boot.transaction.pojo.Foo;
import cn.tac.test.spring.boot.transaction.service.FooServiceWithTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author tac
 * @since 05/12/2017
 */
@Service
@Transactional
public class FooServiceWithTransactionalImpl implements FooServiceWithTransactional{
    @Autowired
    private FooMapper mapper;

    @Override
    public int insert(Foo foo) {
        int num = mapper.insert(foo);
        int i = 1 / 0;
        return num;
    }

    @Override
    public int invokeInsert(Foo foo) {
        return insert(foo);
    }
}
