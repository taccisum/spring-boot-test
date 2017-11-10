package cn.tac.test.spring.boot.testing.web.mvc;

import cn.tac.test.spring.boot.testing.web.mvc.controller.FooController;
import cn.tac.test.spring.boot.testing.web.mvc.service.FooService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
/**
 * @author tac
 * @since 10/11/2017
 */
@RunWith(SpringRunner.class)
@WebMvcTest(FooController.class)
public class MvcTest {
    @Autowired
    private MockMvc mvc;

    @MockBean
    private FooService service;

    @Test
    public void testSimply() throws Exception {
        mvc.perform(get("/foo/bar1").accept(MediaType.TEXT_PLAIN))
                .andExpect(status().isOk()).andExpect(content().string("bar1"));
    }

    @Test
    public void testSimply1() throws Exception {
        when(service.bar2()).thenReturn("mock bar2");
        mvc.perform(get("/foo/bar2").accept(MediaType.TEXT_PLAIN))
                .andExpect(status().isOk()).andExpect(content().string("mock bar2"));
    }
}
