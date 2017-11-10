package cn.tac.test.spring.boot.testing.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

/**
 * @author tac
 * @since 10/11/2017
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class MockTest {
    @MockBean
    private FooService fooService;

    @Test
    public void testSimply() {
        when(fooService.bar1()).thenReturn("mock");
        assertThat(fooService.bar1()).isEqualTo("mock");
    }

    @Service
    static class FooService {
        public String bar1(){
            return "bar1";
        }
    }
}
