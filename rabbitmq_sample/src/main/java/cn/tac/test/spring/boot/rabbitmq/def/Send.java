package cn.tac.test.spring.boot.rabbitmq.def;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import static cn.tac.test.spring.boot.rabbitmq.def.Constant.HOST;
import static cn.tac.test.spring.boot.rabbitmq.def.Constant.QUEUE_NAME;

/**
 * @author tac
 * @since 09/11/2017
 */
public class Send {

    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost(HOST);
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare(QUEUE_NAME,false, false, false, null);
        String message = "Hello World! - Message from java";
        channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
        System.out.println(" [x] Sent '" + message + "'");
        channel.close();
        connection.close();
    }
}
