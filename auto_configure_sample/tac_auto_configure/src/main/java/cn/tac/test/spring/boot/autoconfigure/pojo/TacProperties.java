package cn.tac.test.spring.boot.autoconfigure.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author tac
 * @since 13/11/2017
 */
@ConfigurationProperties(prefix = "tac")
public class TacProperties {
    private String greeting = "welcome";

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
