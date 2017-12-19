package cn.tac.test.spring.boot.transaction;

import cn.tac.test.spring.boot.transaction.mapper.FooMapper;
import cn.tac.test.spring.boot.transaction.pojo.Foo;
import cn.tac.test.spring.boot.transaction.service.FooService;
import cn.tac.test.spring.boot.transaction.service.FooServiceWithTransactional;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author tac
 * @since 05/12/2017
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SimpleTest.class)
@SpringBootApplication
public class SimpleTest {
    @Autowired
    private FooService service;
    @Autowired
    private FooServiceWithTransactional serviceWithTransactional;
    @Autowired
    private FooMapper mapper;

    @Test
    public void testSimply() {
        assertThat(mapper).isNotNull();
        assertThat(service).isNotNull();
        assertThat(serviceWithTransactional).isNotNull();
        System.out.println(service.getClass());
        System.out.println(serviceWithTransactional.getClass());
    }

    @Test
    public void insert() {
        Foo o = new Foo("hhh");
        assertThat(service.insert(o)).isEqualTo(1);
        assertThat(mapper.find(o.getId())).isNotNull();
    }

    @Test
    public void insertFailure() {
        Foo o = new Foo("hhh");
        try {
            serviceWithTransactional.insert(o);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println(o.getId());
        assertThat(mapper.find(o.getId())).isNull();
    }
}
