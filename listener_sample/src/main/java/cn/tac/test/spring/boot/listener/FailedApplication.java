package cn.tac.test.spring.boot.listener;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Import;

/**
 * @author tac
 * @since 27/10/2017
 */
@SpringBootApplication
@Import(FailedBean.class)
public class FailedApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .listeners(failed())
                .sources(FailedApplication.class)
                .run(args);
    }

    private static ApplicationListener<ApplicationFailedEvent> failed() {
        return event -> System.out.println("app failed");
    }
}

class FailedBean implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        throw new RuntimeException();
    }
}
