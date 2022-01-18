package com.jaego.web.main;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MainController {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String main(Model model,HttpSession session) {
		
		String ha = "하";
		model.addAttribute("ha",ha);
		
		return "/main";
	}
	

}
