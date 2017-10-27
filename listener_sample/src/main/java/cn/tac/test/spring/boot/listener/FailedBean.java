package cn.tac.test.spring.boot.listener;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author tac
 * @since 27/10/2017
 */
public class FailedBean implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        throw new RuntimeException();
    }
}
