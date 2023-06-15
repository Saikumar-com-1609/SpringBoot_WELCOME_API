package com.ait.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ait.feignclient.GreetFeignClient;

@RestController
public class welcomeRestController {
	
	@Autowired
	private GreetFeignClient greetFeignClient;
	
	@GetMapping("/welcome")
	public String getWelcomeMsh() {
		
		String invokeGreetApi = greetFeignClient.invokeGreetApi();
		
		return invokeGreetApi + ", Welcome To Our Institute";
	}

}
