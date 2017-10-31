package cn.tac.test.spring.boot.args;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

/**
 * @author tac
 * @since 27/10/2017
 */
@Component
public class ArgsHandlerBean {
    @Value("${greeting}")
    private String greeting;

    @Autowired
    public ArgsHandlerBean(ApplicationArguments args) {
        System.out.println(args.getOptionValues("server.port"));
        System.out.println(args.getOptionValues("spring.profile.active"));
        //null，还未加载.properties文件
        System.out.println(greeting);
    }
}
