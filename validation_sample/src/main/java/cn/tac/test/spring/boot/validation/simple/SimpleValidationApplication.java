package cn.tac.test.spring.boot.validation.simple;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import sun.jvm.hotspot.runtime.ConstructionException;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.constraints.Size;


/**
 * @author tac
 * @since 08/11/2017
 */
@SpringBootApplication
public class SimpleValidationApplication {
    public static void main(String[] args) {
        SpringApplication.run(SimpleValidationApplication.class, args);
    }

    @Component
    public class Foo implements InitializingBean{
        @Autowired
        private MyBean bean;

        @Override
        public void afterPropertiesSet() throws Exception {

            try {
                bean.findByCodeAndAuthor("12345678");
                bean.findByCodeAndAuthor("1234567");
            } catch (ConstraintViolationException e) {
                for (ConstraintViolation constraintViolation : e.getConstraintViolations()){
                    System.out.println(constraintViolation.getPropertyPath().toString() + ": " + constraintViolation.getMessage());
                }
            }

        }
    }

    @Service
    @Validated
    public class MyBean {
        public void findByCodeAndAuthor(@Size(min = 8, max = 10) String code) {
        }

    }
}
