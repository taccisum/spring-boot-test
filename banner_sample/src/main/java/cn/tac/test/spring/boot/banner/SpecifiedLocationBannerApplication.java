package cn.tac.test.spring.boot.banner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author tac
 * @since 27/10/2017
 */
@SpringBootApplication
public class SpecifiedLocationBannerApplication {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        Collections.addAll(ls, args);
        ls.add("--spring.profiles.active=sl_banner");
        String[] arr = new String[ls.size()];
        SpringApplication.run(SpecifiedLocationBannerApplication.class, ls.toArray(arr));
    }
}
