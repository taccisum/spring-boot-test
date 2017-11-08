package cn.tac.test.spring.boot.redis.simple;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @author tac
 * @since 08/11/2017
 */
@SpringBootApplication
public class SimpleRedisApplication {
    public static void main(String[] args) {
        SpringApplication.run(SimpleRedisApplication.class, args);
    }

    @Component
    public class MyBean implements InitializingBean {

        private StringRedisTemplate template;

        @Autowired
        public MyBean(StringRedisTemplate template) {
            this.template = template;
        }

        @Override
        public void afterPropertiesSet() throws Exception {
            template.opsForValue().increment("tac", 1);
            System.out.println(template.opsForValue().get("tac"));
        }
    }
}
