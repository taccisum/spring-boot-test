package cn.tac.test.spring.boot.extconfig.specify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author tac
 * @since 31/10/2017
 */
@SpringBootApplication
public class SpecifyConfigFileApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpecifyConfigFileApplication.class, "--spring.config.name=abc");
    }
}
