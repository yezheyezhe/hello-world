package com.hlj.controller;

import com.hlj.feign.HelloFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lunhui
 * @date 2019/07/03
 */
@RestController
public class HelloController {
	@Autowired
	private HelloFeign helloFeign;

	@RequestMapping(value = "/hello")
	public String sayHello(@RequestParam(defaultValue = "service-feign") String name) {
		return helloFeign.sayHello(name);
	}
}
