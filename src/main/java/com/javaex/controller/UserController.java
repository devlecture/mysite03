package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaex.vo.UserVo;


@Controller
@RequestMapping(value = "/user")
public class UserController {

	
	@GetMapping("/join")
	public String joinForm() {
		System.out.println("UserController.joinForm()");
		
		return "user/joinForm";
	}
	

	
	@PostMapping("/join")
	public String join(@ModelAttribute UserVo userVo) {
		System.out.println("UserController.join()");
		
		System.out.println(userVo);
		
		
		return "user/joinForm";
	}
	

	
	
}
