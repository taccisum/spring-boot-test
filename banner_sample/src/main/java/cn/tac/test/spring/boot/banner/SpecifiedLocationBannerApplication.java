package cn.tac.test.spring.boot.banner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author tac
 * @since 27/10/2017
 */
@SpringBootApplication
public class SpecifiedLocationBannerApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(SpecifiedLocationBannerApplication.class)
                .profiles("sl_banner")
                .run(args);
    }
}
