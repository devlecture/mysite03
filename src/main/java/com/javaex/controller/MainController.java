package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	/* @RequestMapping(value="/", method=RequestMethod.GET ) */
	@GetMapping("/")
	public String index() {
		System.out.println("MainController.index()");
		
		return "main/index";
		
	}


	
	
}


