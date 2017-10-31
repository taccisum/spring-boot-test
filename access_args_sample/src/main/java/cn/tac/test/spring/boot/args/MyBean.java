package cn.tac.test.spring.boot.args;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author tac
 * @since 31/10/2017
 */
@Component
public class MyBean implements InitializingBean {
    @Value("${greeting}")
    private String greeting;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(greeting);
    }
}
