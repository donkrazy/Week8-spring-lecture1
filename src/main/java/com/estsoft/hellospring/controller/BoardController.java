package com.estsoft.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping( "/board" )
public class BoardController {
	
	@RequestMapping( "/list" )
	@ResponseBody
	public String list( String kwd, @RequestParam( "p" ) int page ) {
//추천	public String list( @RequestParam( "kwd" ) String keyword, @RequestParam( "p" ) int page ) {
		System.out.println( page + ":" + kwd );
		return "BoardController:list()";
	}
	
	@RequestMapping( "/delete" )
	@ResponseBody
	public String delete( @RequestParam( value="no", required=true, defaultValue="-1" ) Long no ) {
		System.out.println( no );
		return "BoardController:delete()";
	}
	
	@RequestMapping( "/view/{no}" )
	public ModelAndView view( @PathVariable( "no" ) Long no ) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject( "no", no );
		mav.addObject( "name", "안대혁" );
		mav.addObject( "email", "kickscar@gmail.com" );
		mav.setViewName( "/WEB-INF/views/view.jsp" );
		
		return mav;
	}

	@RequestMapping( "/view2/{no}" )
	public String view2( @PathVariable( "no" ) Long no, Model model ) {
		model.addAttribute( "no", no );
		model.addAttribute( "name", "안대혁" );
		model.addAttribute( "email", "kickscar@gmail.com" );
		
		return "/WEB-INF/views/view.jsp";
	}
	
	
}
