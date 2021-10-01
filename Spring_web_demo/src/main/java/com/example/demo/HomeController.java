package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("home")
	public ModelAndView home(dragon drg) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("drg", drg);
		mv.setViewName("home");
		return mv;
	}
}
