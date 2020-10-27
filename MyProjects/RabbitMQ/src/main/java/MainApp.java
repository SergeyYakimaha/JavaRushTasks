import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class MainApp {
    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();

        factory.setHost("localhost");

        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.queueDeclare("test_queue", true, false, false, null);

        String message;

        message = "message #1";
        channel.basicPublish("", "test_queue", null, message.getBytes());
        message = "message #2";
        channel.basicPublish("", "test_queue", null, message.getBytes());
        message = "message #3";
        channel.basicPublish("", "test_queue", null, message.getBytes());

        channel.close();
        connection.close();

//        Consumer consumer = new DefaultConsumer(channel) {
//            @Override
//            public void handleDelivery(
//                    String consumerTag,
//                    Envelope envelope,
//                    AMQP.BasicProperties properties,
//                    byte[]body) throws IOException {
//
//                String message = new String(body, "UTF-8");
//                System.out.println(message);
//            }
//        };
//
//        channel.basicConsume("test_queue", true, consumer);

    }
}
