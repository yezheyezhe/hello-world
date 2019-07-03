package com.hlj.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author lunhui
 * @date 2019/07/03
 */
@FeignClient(value = "service-hi", fallback = HelloFeignHystric.class)
public interface HelloFeign {
	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	String sayHello(@RequestParam(value = "name") String name);
}
