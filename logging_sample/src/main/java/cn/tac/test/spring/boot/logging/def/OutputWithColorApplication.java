package cn.tac.test.spring.boot.logging.def;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author tac
 * @since 02/11/2017
 */
@SpringBootApplication
public class OutputWithColorApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .profiles("color")
                .sources(OutputWithColorApplication.class)
                .run(args);
    }
}
