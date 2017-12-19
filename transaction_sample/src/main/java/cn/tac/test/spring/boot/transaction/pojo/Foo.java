package cn.tac.test.spring.boot.transaction.pojo;

import java.util.UUID;

/**
 * @author tac
 * @since 05/12/2017
 */
public class Foo {
    public Foo() {
    }

    public Foo(String bar1) {
        this.id = UUID.randomUUID().toString().replace("-", "");
        this.bar1 = bar1;
    }

    private String id;
    private String bar1;

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
}
