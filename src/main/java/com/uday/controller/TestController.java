package com.uday.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@Slf4j
public class TestController {
	
	@GetMapping("/test")
	public String test(String name) {
		log.info("Test controller /test - gradle");
		return "welcome = " + name; 
	}

	@GetMapping("/greeting")
	public ModelAndView greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		log.info("Test controller /greeting - gradle");
		ModelAndView modelAndView = new ModelAndView("greeting");
		model.addAttribute("name", name);
		return modelAndView;
	}

}
