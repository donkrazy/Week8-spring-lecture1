package com.estsoft.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping( "/hello" )
	public String hello() {
		return "/WEB-INF/views/hello.jsp";
	}
	
	@RequestMapping( "/main" )
	@ResponseBody
	public String main() {
		return "main";
	}
}
