package com.hlj.controller;

import com.hlj.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lunhui
 * @date 2019/07/03
 */
@RestController
public class HelloController {
	@Autowired
	private HelloService helloService;

	@GetMapping("/hello")
	public String hello(@RequestParam(defaultValue = "serviceribbon") String name) {
		return helloService.sayHello(name);
	}


}
