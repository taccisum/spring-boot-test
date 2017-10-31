package cn.tac.test.spring.boot.args;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

/**
 * @author tac
 * @since 27/10/2017
 */
@Component
public class ArgsHandlerBean {
    @Autowired
    public ArgsHandlerBean(ApplicationArguments args) {
        System.out.println(args.getOptionValues("server.port"));
        System.out.println(args.getOptionValues("spring.profile.active"));
    }
}
