package cn.tac.test.spring.boot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author tac
 * @since 26/10/2017
 */
@Component
public class MyRunner implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println("hello sprin boot");
    }
}
