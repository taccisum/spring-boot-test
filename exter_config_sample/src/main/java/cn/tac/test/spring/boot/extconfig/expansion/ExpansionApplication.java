package cn.tac.test.spring.boot.extconfig.expansion;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.stereotype.Component;

/**
 * @author tac
 * @since 03/11/2017
 */
@SpringBootApplication
public class ExpansionApplication {
    public static void main(String[] args) {
        //先执行compileJava
        new SpringApplicationBuilder()
                .profiles("expansion")
                .sources(ExpansionApplication.class)
                .run(args);
    }

    @Component
    public class Runner implements ApplicationRunner {
        @Value("${app.name}")
        private String name;

        @Override
        public void run(ApplicationArguments applicationArguments) throws Exception {
            System.out.println(name);
        }
    }
}
