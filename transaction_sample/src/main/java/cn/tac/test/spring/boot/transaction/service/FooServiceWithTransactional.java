package cn.tac.test.spring.boot.transaction.service;

import cn.tac.test.spring.boot.transaction.pojo.Foo;

/**
 * @author tac
 * @since 05/12/2017
 */
public interface FooServiceWithTransactional {
    int insert(Foo foo);
    int invokeInsert(Foo foo);
}
