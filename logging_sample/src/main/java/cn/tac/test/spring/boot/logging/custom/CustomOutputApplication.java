package cn.tac.test.spring.boot.logging.custom;

import cn.tac.test.spring.boot.logging.runnner.LoggingRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Import;

/**
 * @author tac
 * @since 02/11/2017
 */
@SpringBootApplication
@Import(LoggingRunner.class)
public class CustomOutputApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .profiles("custom")
                .sources(CustomOutputApplication.class)
                .run(args);
    }
}
