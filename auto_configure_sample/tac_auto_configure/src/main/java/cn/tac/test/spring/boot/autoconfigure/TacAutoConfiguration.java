package cn.tac.test.spring.boot.autoconfigure;

import cn.tac.test.spring.boot.autoconfigure.pojo.TacProperties;
import cn.tac.test.spring.boot.autoconfigure.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author tac
 * @since 13/11/2017
 */

@Configuration
@EnableConfigurationProperties(TacProperties.class)
public class TacAutoConfiguration {
    @Autowired
    private TacProperties tacProperties;

    @Bean
    public GreetingService greetingService(){
        return new GreetingService(tacProperties);
    }
}
