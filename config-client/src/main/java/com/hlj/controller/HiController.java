package com.hlj.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lunhui
 * @date 2019/07/03
 */
@RestController
public class HiController {

	@Value("${foo}")
	String foo;

	@RequestMapping(value = "/hi")
	public String hi() {
		return foo;
	}

}
