package cn.tac.test.spring.boot.extconfig.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author tac
 * @since 31/10/2017
 */
@Component
public class RandomBean {
    @Value("${my.secret}")
    private String sceret;
    @Value("${my.number}")
    private int number;
    @Value("${my.bignumber}")
    private long bignumber;
    @Value("${my.uuid}")
    private String uuid;
    @Value("${my.number.less.than.ten}")
    private int lessThanTenNumber;
    @Value("${my.number.in.range}")
    private int numberInRange;

    public String getSceret() {
        return sceret;
    }

    public void setSceret(String sceret) {
        this.sceret = sceret;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public long getBignumber() {
        return bignumber;
    }

    public void setBignumber(long bignumber) {
        this.bignumber = bignumber;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public int getLessThanTenNumber() {
        return lessThanTenNumber;
    }

    public void setLessThanTenNumber(int lessThanTenNumber) {
        this.lessThanTenNumber = lessThanTenNumber;
    }

    public int getNumberInRange() {
        return numberInRange;
    }

    public void setNumberInRange(int numberInRange) {
        this.numberInRange = numberInRange;
    }

    @Override
    public String toString() {
        return "RandomBean{" +
                "sceret='" + sceret + '\'' +
                ", number=" + number +
                ", bignumber=" + bignumber +
                ", uuid='" + uuid + '\'' +
                ", lessThanTenNumber=" + lessThanTenNumber +
                ", numberInRange=" + numberInRange +
                '}';
    }
}
