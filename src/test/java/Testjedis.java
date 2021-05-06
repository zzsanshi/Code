import com.alibaba.fastjson.JSONObject;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

public class Testjedis {
    public static void main(String[] args) {
//        Jedis jedis = new Jedis("121.248.201.191",6379);
//        Jedis jedis = new Jedis("192.168.1.187",6379);
     Jedis jedis = new Jedis("192.168.1.190",6379);

        //jedis所用命令都在里面
        System.out.println(jedis.ping());//连接测试
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("hello","world");
        jsonObject.put("name","zz");
        Transaction multi = jedis.multi();
        String res = jsonObject.toJSONString();
        try {
            multi.set("user1", res);
            multi.set("user12", res);
            multi.exec();
        } catch (Exception e) {
            multi.discard();//放弃事务
            e.printStackTrace();
        } finally {
            jedis.close();
        }


    }
}
