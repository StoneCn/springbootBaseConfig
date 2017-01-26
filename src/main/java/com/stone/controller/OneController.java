package com.stone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OneController {

	@RequestMapping("/test/one")
	public String test(Model model){
		model.addAttribute("name", "蔡阳辉");
		return "one";
	}
}
