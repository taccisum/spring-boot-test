package cn.tac.test;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author tac
 * @since 26/10/2017
 */
public class MyBean implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("import bean");
    }
}
