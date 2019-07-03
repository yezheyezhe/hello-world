package com.hlj.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lunhui
 * @date 2019/07/03
 */
@RestController
public class ServiceHiController {

	@Value("${server.port}")
	private String port;

	@RequestMapping("/hi")
	public String hi(@RequestParam(defaultValue = "servicehi") String name) {
		return "hi " + name + " ,i am from port:" + port;
	}

}
