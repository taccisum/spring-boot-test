package cn.tac.test.sping.boot.autoconfigure;

import cn.tac.test.spring.boot.autoconfigure.service.GreetingService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

/**
 * @author tac
 * @since 13/11/2017
 */
@SpringBootApplication //(exclude = TacAutoConfiguration.class)
public class AutoConfigurateSampleApp {
    public static void main(String[] args) {
        SpringApplication.run(AutoConfigurateSampleApp.class, args);
    }

    @Component
    static class MyBean implements InitializingBean {
        @Autowired
        private GreetingService greetingService;

        @Override
        public void afterPropertiesSet() throws Exception {
            System.out.println(greetingService.doGreeting());
        }
    }
}
