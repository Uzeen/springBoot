package com.springDI.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class Test {

	@RequestMapping("/test")
	public String sayHello() {
		return "Hello i am running from Spring Boot CICD project" ;
	}
	
	@RequestMapping("/")
	public String sayGood() {
		return "All the best Nonu you are my charm !" ;
	}

}