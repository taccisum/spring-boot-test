package cn.tac.test.spring.boot.testing.mock.embedded;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

/**
 * @author tac
 * @since 10/11/2017
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@SpringBootApplication
@RunWith(SpringRunner.class)
public class EmbeddedMockTest {

    @Autowired
    private FooService fooService;
    @MockBean
    private FooDao fooDao;

    @Test
    public void testSimply() {
        when(fooDao.bar1()).thenReturn("mock");
        assertThat(fooService.bar1()).isEqualTo("mock");
    }

    @Service
    static class FooService {
        @Autowired
        private FooDao fooDao;

        public String bar1(){
            return fooDao.bar1();
        }
    }

    @Repository
    static class FooDao {
        public String bar1() {
            return "bar1";
        }
    }
}
