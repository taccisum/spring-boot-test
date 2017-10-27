package cn.tac.test.spring.boot.listener;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.event.*;
import org.springframework.context.ApplicationListener;

/**
 * @author tac
 * @since 27/10/2017
 */
@SpringBootApplication
public class SimpleApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .listeners(
                        starting(),
                        environmentPrepared(),
                        prepared(),
                        ready()
                )
                .sources(SimpleApplication.class)
                .run(args);
    }

    private static ApplicationListener<ApplicationStartingEvent> starting() {
        return event -> System.out.println("start app");
    }

    private static ApplicationListener<ApplicationEnvironmentPreparedEvent> environmentPrepared() {
        return event -> System.out.println("prepare environment");
    }

    private static ApplicationListener<ApplicationPreparedEvent> prepared() {
        return event -> System.out.println("app prepared");
    }

    private static ApplicationListener<ApplicationReadyEvent> ready() {
        return event -> System.out.println("app ready");
    }
}
