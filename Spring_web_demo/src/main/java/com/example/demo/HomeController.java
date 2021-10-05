package com.example.demo;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("home")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("drgList", dragonDAO.getAllDragon());
		mv.setViewName("home");
		
		return mv;
	}
	
	@RequestMapping("addDragon")
	public ModelAndView addDragon(dragon drg) {
		dragonDAO.addDragon(drg.getD_id(), drg.getD_name(), drg.getD_class());
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("drgList", dragonDAO.getAllDragon());
		mv.setViewName("home");
		
		return mv;
	}
}
