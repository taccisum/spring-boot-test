package cn.tac.test.spring.boot.redis.caching.pojo;

import java.io.Serializable;

/**
 * @author tac
 * @since 08/11/2017
 */
public class CachingFoo implements Serializable {
    public CachingFoo() {
    }

    public CachingFoo(String id) {
        this.id = id;
    }

    private String id;
    private String bar1;
    private Integer bar2;

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

    public Integer getBar2() {
        return bar2;
    }

    public void setBar2(Integer bar2) {
        this.bar2 = bar2;
    }

    @Override
    public String toString() {
        return "CachingFoo{" +
                "id='" + id + '\'' +
                ", bar1='" + bar1 + '\'' +
                ", bar2=" + bar2 +
                '}';
    }


}
