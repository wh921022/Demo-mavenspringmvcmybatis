package com.svgteam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.svgteam.service.StudentService;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String hello(ModelMap model){
			StudentService ss = new StudentService();
			model.addAttribute("list", ss.getAllStudent());
		return "index";
	}
}
