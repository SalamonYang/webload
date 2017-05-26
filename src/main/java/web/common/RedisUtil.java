package web.common;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class RedisUtil {
	/** 数据源 */
	protected JedisPool jedisPool;

	public void setJedisPool(JedisPool jedisPool) {
		this.jedisPool = jedisPool;
	}

	public String get(String key) {
		Jedis jedis = null;
		String rt = null;
		jedis = jedisPool.getResource();
		rt = jedis.get(key);
		return rt;
	}
}
