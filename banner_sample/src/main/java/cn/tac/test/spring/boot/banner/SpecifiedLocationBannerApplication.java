package cn.tac.test.spring.boot.banner;

import cn.tac.test.spring.boot.banner.util.StartupUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author tac
 * @since 27/10/2017
 */
@SpringBootApplication
public class SpecifiedLocationBannerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpecifiedLocationBannerApplication.class, StartupUtils.specifyEnv(args, "sl_banner"));
    }
}
