package cn.tac.test.spring.boot.extconfig.common;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

/**
 * @author tac
 * @since 31/10/2017
 */
@Component
@ConfigurationProperties(prefix = "binder.yaml.validation")
@Validated
public class ValidatedBinderBean {
    @NotNull
    private String foo1;
    @NotEmpty
    private String foo2;

    public String getFoo1() {
        return foo1;
    }

    public void setFoo1(String foo1) {
        this.foo1 = foo1;
    }

    public String getFoo2() {
        return foo2;
    }

    public void setFoo2(String foo2) {
        this.foo2 = foo2;
    }

    @Override
    public String toString() {
        return "ValidatedBinderBean{" +
                "foo1='" + foo1 + '\'' +
                ", foo2='" + foo2 + '\'' +
                '}';
    }
}
