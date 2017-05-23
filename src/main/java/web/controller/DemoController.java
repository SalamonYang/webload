package web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController  
@RequestMapping(value = "/demo")
public class DemoController {
	
	@RequestMapping(value = "/getTip", method = RequestMethod.GET)
	public String getDemoTip() {
		return "getTip";
	}
}
