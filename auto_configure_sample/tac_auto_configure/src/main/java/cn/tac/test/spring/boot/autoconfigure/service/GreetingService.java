package cn.tac.test.spring.boot.autoconfigure.service;

import cn.tac.test.spring.boot.autoconfigure.pojo.TacProperties;

/**
 * @author tac
 * @since 13/11/2017
 */
public class GreetingService {
    private TacProperties tacProperties;

    public GreetingService(TacProperties tacProperties) {
        this.tacProperties = tacProperties;
    }

    public String doGreeting(){
        return tacProperties.getGreeting();
    }
}
