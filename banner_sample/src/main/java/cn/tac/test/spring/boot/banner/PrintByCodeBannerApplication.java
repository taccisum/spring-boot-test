package cn.tac.test.spring.boot.banner;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

/**
 * @author tac
 * @since 27/10/2017
 */
@SpringBootApplication
public class PrintByCodeBannerApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(PrintByCodeBannerApplication.class)
                .profiles("pbc_banner")
                .banner(new MyBanner())
                .run(args);
    }

    static class MyBanner implements Banner {
        @Override
        public void printBanner(Environment environment, Class<?> aClass, PrintStream printStream) {
            printStream.println("i'm a banner print by code");
        }
    }
}
