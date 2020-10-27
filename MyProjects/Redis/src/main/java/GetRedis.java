import redis.clients.jedis.Jedis;

public class GetRedis {
    public static void main(String[] args) {

        try (Jedis jedis = new Jedis()) {
            jedis.connect();

            jedis.smembers("fruits").forEach(System.out::println);

            //jedis.smembers("fruits").forEach(value -> System.out.println(value));

            System.out.println(jedis.get("queue#tasks"));
            System.out.println(jedis.rpop("queue#tasks"));
            System.out.println(jedis.rpop("queue#tasks"));
            System.out.println(jedis.rpop("queue#tasks"));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
