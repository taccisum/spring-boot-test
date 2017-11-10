package cn.tac.test.spring.boot.hsql;

import cn.tac.test.spring.boot.hsql.mapper.HsqlMapper;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

/**
 * @author tac
 * @since 10/11/2017
 */
@SpringBootApplication
public class HsqlApplication {
    public static void main(String[] args) {
        SpringApplication.run(HsqlApplication.class, args);
    }

    @Component
    class MyBean implements InitializingBean {
        @Autowired
        private HsqlMapper mapper;

        @Override
        public void afterPropertiesSet() throws Exception {
            for (int i = 1; i <= 5; i++) {
                System.out.println(mapper.test(i));
            }
        }
    }
}
