package com.estsoft.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.estsoft.hellospring.vo.UserVo;

@Controller
@RequestMapping( "/user" )
public class UserController {
	
	@RequestMapping( "/joinform" )
	public String joinform() {
		return "/WEB-INF/views/joinform.jsp";
	}
	
	@RequestMapping( value="/join", method=RequestMethod.POST  )
	public String join(  @ModelAttribute UserVo userVo ) {
		System.out.println( userVo );
		// DAO를 통해서 비즈니스 작업
		return "redirect:/main";
	}
	
	@RequestMapping( value="/loginform" )
	@ResponseBody
	public String loginform() {
		return "UserController:loginform()";
	}
	
	@RequestMapping( value="/login", method=RequestMethod.POST  )
	@ResponseBody
	public String login() {
		return "UserController:loginform()";
	}
	
	
}
