import redis.clients.jedis.Jedis;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Map;
import java.util.Set;

public class SetRedis {

    public static void main(String[] args) {

        try (Jedis jedis = new Jedis()) {
            jedis.connect();
//
            jedis.flushAll();

//            jedis.sadd("fruits", "apple", "pear", "banana");
//
//            jedis.lpush("queue#tasks", "firstTask");
//            jedis.lpush("queue#tasks", "secondTask");

            for (int i = 0; i < 200_000; i++) {
                jedis.set(String.valueOf(i), RandomStringUtils.random(10, "asdfhxckjvmxckvmspdf"));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
