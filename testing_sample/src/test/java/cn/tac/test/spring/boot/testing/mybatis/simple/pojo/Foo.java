package cn.tac.test.spring.boot.testing.mybatis.simple.pojo;

import java.util.UUID;

/**
 * @author tac
 * @since 10/11/2017
 */
public class Foo {
    private String id;
    private String bar1;

    public Foo() {
    }

    public Foo(String bar1) {
        this.id = UUID.randomUUID().toString();
        this.bar1 = bar1;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBar1() {
        return bar1;
    }

    public void setBar1(String bar1) {
        this.bar1 = bar1;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "id='" + id + '\'' +
                ", bar1='" + bar1 + '\'' +
                '}';
    }
}
