package com.peixoto.ramais.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/filiais")
public class FilialController {
	
	@GetMapping
	public ModelAndView inicio() {
		ModelAndView mv = new ModelAndView("pages/listaramais/filiais");
		
		return mv;
	}
}
