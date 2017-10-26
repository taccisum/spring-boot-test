package cn.tac.test;

import org.springframework.context.annotation.Bean;

/**
 * @author tac
 * @since 26/10/2017
 */
public class Conf {
    @Bean
    public String test(){
        System.out.println("import configuration");
        return "hello";
    }
}
