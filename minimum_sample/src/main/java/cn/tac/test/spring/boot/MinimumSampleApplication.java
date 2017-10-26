package cn.tac.test.spring.boot;

import cn.tac.test.Conf;
import cn.tac.test.MyBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author tac
 * @since 26/10/2017
 */

//@SpringBootApplication
//等价于以下三个注解
@Configuration
@ComponentScan
@EnableAutoConfiguration
@Import(value = {Conf.class, MyBean.class})
public class MinimumSampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(MinimumSampleApplication.class);
    }
}
