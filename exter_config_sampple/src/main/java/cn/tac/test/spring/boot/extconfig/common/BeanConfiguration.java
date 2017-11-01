package cn.tac.test.spring.boot.extconfig.common;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author tac
 * @since 01/11/2017
 */
@Configuration
public class BeanConfiguration {
    @Bean
    @ConfigurationProperties(prefix = "binder.yaml.third")
    public ThirdPartBinderBean thirdPartBinderBean(){
        ThirdPartBinderBean bean = new ThirdPartBinderBean();
        bean.setFoo2("bar2");
        return bean;
    }
}
