package cn.tac.test.spring.boot.rabbitmq.simple.send;

import cn.tac.test.spring.boot.rabbitmq.simple.Constant;
import cn.tac.test.spring.boot.rabbitmq.simple.Queues;
import cn.tac.test.spring.boot.rabbitmq.simple.pojo.Foo;
import io.codearte.jfairy.Fairy;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author tac
 * @since 09/11/2017
 */
@SpringBootApplication
@Import(Queues.class)
public class SimpleSendApplication {
    public static void main(String[] args) {
        SpringApplication.exit(SpringApplication.run(SimpleSendApplication.class, args));
    }

    @Component
    class Producer implements InitializingBean {
        private final AmqpAdmin amqpAdmin;
        private final AmqpTemplate amqpTemplate;

        @Autowired
        public Producer(AmqpAdmin amqpAdmin, AmqpTemplate amqpTemplate) {
            this.amqpAdmin = amqpAdmin;
            this.amqpTemplate = amqpTemplate;
        }

        @Override
        public void afterPropertiesSet() throws Exception {
            Fairy fairy = Fairy.create();
            System.out.println(" [x] Sent message ");
            amqpTemplate.convertAndSend(
                    Constant.QUEUE_NAME,
                    new Foo(fairy.person().getFullName(), fairy.baseProducer().randomInt(2000), new Date()));
        }
    }
}
