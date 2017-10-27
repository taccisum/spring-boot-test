package cn.tac.test.spring.boot.banner;

import cn.tac.test.spring.boot.banner.util.StartupUtils;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author tac
 * @since 27/10/2017
 */
@SpringBootApplication
public class PrintByCodeBannerApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(PrintByCodeBannerApplication.class);
        application.setBanner(new MyBanner());
        application.run(StartupUtils.specifyEnv(args, "pbc_banner"));
    }

    static class MyBanner implements Banner {
        @Override
        public void printBanner(Environment environment, Class<?> aClass, PrintStream printStream) {
            printStream.println("i'm a banner print by code");
        }
    }
}
