package cn.tac.test.spring.boot.extconfig.common;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author tac
 * @since 31/10/2017
 */
@Component
@ConfigurationProperties(prefix = "binder.yaml")
public class BinderBean {
    private String foo1;
    private String foo2;
    private Boolean foo3;
    private Integer foo4;
    private Float foo5;
    private List<String> foo6;
    private String lastFoo;

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

    public Boolean getFoo3() {
        return foo3;
    }

    public void setFoo3(Boolean foo3) {
        this.foo3 = foo3;
    }

    public Integer getFoo4() {
        return foo4;
    }

    public void setFoo4(Integer foo4) {
        this.foo4 = foo4;
    }

    public Float getFoo5() {
        return foo5;
    }

    public void setFoo5(Float foo5) {
        this.foo5 = foo5;
    }

    public List<String> getFoo6() {
        return foo6;
    }

    public void setFoo6(List<String> foo6) {
        this.foo6 = foo6;
    }

    public String getLastFoo() {
        return lastFoo;
    }

    public void setLastFoo(String lastFoo) {
        this.lastFoo = lastFoo;
    }

    @Override
    public String toString() {
        return "BinderBean{" +
                "foo1='" + foo1 + '\'' +
                ", foo2='" + foo2 + '\'' +
                ", foo3=" + foo3 +
                ", foo4=" + foo4 +
                ", foo5=" + foo5 +
                ", foo6=" + foo6 +
                ", lastFoo='" + lastFoo + '\'' +
                '}';
    }
}
