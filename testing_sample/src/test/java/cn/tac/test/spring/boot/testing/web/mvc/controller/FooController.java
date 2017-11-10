package cn.tac.test.spring.boot.testing.web.mvc.controller;

import cn.tac.test.spring.boot.testing.web.mvc.service.FooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tac
 * @since 10/11/2017
 */
@RestController
@RequestMapping("foo")
public class FooController {
    @Autowired
    private FooService fooService;

    @RequestMapping(value = "bar1", method = RequestMethod.GET)
    public String bar1() {
        return "bar1";
    }


    @RequestMapping(value = "bar2", method = RequestMethod.GET)
    public String bar2() {
       return fooService.bar2();
    }
}
