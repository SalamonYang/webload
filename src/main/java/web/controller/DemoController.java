package web.controller;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import redis.clients.jedis.JedisPool;
import web.service.DemoService;

@RestController
@RequestMapping(value = "/demo")
public class DemoController {

	@Resource
	private DemoService demoService;
	
	
	@RequestMapping(value = "/getTip", method = RequestMethod.GET)
	public String getDemoTip() {
		return demoService.getTip();
	}
}
