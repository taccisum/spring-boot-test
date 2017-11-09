package cn.tac.test.spring.boot.rabbitmq.simple;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;

/**
 * @author tac
 * @since 09/11/2017
 */
public class Queues {
    @Bean
    public Queue queue() {
        return new Queue(Constant.QUEUE_NAME);
    }
}
