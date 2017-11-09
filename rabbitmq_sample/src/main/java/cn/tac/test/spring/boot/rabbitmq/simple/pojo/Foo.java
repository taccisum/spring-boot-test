package cn.tac.test.spring.boot.rabbitmq.simple.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author tac
 * @since 09/11/2017
 */
public class Foo implements Serializable {
    public Foo() {

    }

    public Foo(String bar1, Integer bar2, Date bar3) {
        this.bar1 = bar1;
        this.bar2 = bar2;
        this.bar3 = bar3;
    }

    private String bar1;
    private Integer bar2;
    private Date bar3;

    public String getBar1() {
        return bar1;
    }

    public void setBar1(String bar1) {
        this.bar1 = bar1;
    }

    public Integer getBar2() {
        return bar2;
    }

    public void setBar2(Integer bar2) {
        this.bar2 = bar2;
    }

    public Date getBar3() {
        return bar3;
    }

    public void setBar3(Date bar3) {
        this.bar3 = bar3;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "bar1='" + bar1 + '\'' +
                ", bar2=" + bar2 +
                ", bar3=" + bar3 +
                '}';
    }
}
