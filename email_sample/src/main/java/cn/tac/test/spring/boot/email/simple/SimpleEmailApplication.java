package cn.tac.test.spring.boot.email.simple;

import cn.tac.test.spring.boot.email.constant.GlobalConstant;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;

/**
 * @author tac
 * @since 09/11/2017
 */
@SpringBootApplication
public class SimpleEmailApplication {
    public static void main(String[] args) {
        SpringApplication.run(SimpleEmailApplication.class, args);
    }

    @Component
    class MainSender implements InitializingBean {
        @Autowired
        private JavaMailSender sender;

        @Override
        public void afterPropertiesSet() throws Exception {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(((JavaMailSenderImpl) sender).getUsername());
            message.setTo(GlobalConstant.RECEIVER);
            message.setSubject("java mail sender");
            message.setText("hhhh, i'm tac");
            sender.send(message);
        }
    }
}
