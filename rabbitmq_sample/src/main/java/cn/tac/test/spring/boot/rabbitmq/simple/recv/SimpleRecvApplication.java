package cn.tac.test.spring.boot.rabbitmq.simple.recv;

import cn.tac.test.spring.boot.rabbitmq.simple.Constant;
import cn.tac.test.spring.boot.rabbitmq.simple.Queues;
import cn.tac.test.spring.boot.rabbitmq.simple.pojo.Foo;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

/**
 * @author tac
 * @since 09/11/2017
 */
@SpringBootApplication
@Import(Queues.class)
public class SimpleRecvApplication {
    public static void main(String[] args) {
        SpringApplication.run(SimpleRecvApplication.class, args);
    }

    @Component
    class Consumer {
        @RabbitListener(queues = Constant.QUEUE_NAME)
        public void processMessage(Foo content) {
            System.out.println(content);
        }
    }
}
