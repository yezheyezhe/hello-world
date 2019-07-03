package com.hlj.feign;

import org.springframework.stereotype.Component;

/**
 * @author lunhui
 * @date 2019/07/03
 */
@Component
public class HelloFeignHystric implements HelloFeign {
	@Override
	public String sayHello(String name) {
		return "sorry "+name;
	}
}
