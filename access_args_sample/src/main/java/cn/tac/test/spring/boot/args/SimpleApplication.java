package cn.tac.test.spring.boot.args;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author tac
 * @since 27/10/2017
 */
@SpringBootApplication
public class SimpleApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(SimpleApplication.class)
                .run("--server.port=9999", "--spring.profile.active=test");
    }
}
