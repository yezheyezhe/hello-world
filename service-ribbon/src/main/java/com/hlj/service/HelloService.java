package com.hlj.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author lunhui
 * @date 2019/07/03
 */
@Service
public class HelloService {
	@Autowired
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "sayHelloError")
	public String sayHello(String name) {
		return restTemplate.getForObject("http://service-hi/hi?name=" + name, String.class);
	}

	public String sayHelloError(String name) {
		return "hi," + name + ",sorry,error!";
	}
}
