package web.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import web.common.RedisClient;
import web.dao.DemoDAO;
import web.domain.Demo;

@Service("demoService")
public class DemoService {
	@Resource
	private DemoDAO demoDAO;
	@Resource
	private JedisPool jedisPool;
	
	public String getTip() {
		Jedis jedis = jedisPool.getResource();
		jedis.get("dqw");
		
		Demo demo=demoDAO.selectById(4l);
		System.out.println(demo.getId());
		System.out.println(demo.getValue());
		String tip = "This is a tip.";
		return tip;
	}
}
