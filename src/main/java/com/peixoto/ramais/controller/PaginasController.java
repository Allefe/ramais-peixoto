package com.peixoto.ramais.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PaginasController {
	
	
	@GetMapping (value = "/corporativos")
	public ModelAndView corporativos(){
		ModelAndView mv = new ModelAndView("pages/listaramais/corporativos");
		return mv;
	}
	
	@GetMapping (value = "/filiais")
	public ModelAndView filiais(){
		ModelAndView mv = new ModelAndView("pages/listaramais/filiais");
		return mv;
	}
	
	@GetMapping (value = "/gerentesvendas")
	public ModelAndView gerentesvendas(){
		ModelAndView mv = new ModelAndView("pages/listaramais/gerentesvendas");
		return mv;
	}
	
	@GetMapping (value = "/terceiros")
	public ModelAndView terceiros(){
		ModelAndView mv = new ModelAndView("pages/listaramais/terceiros");
		return mv;
	}
	
}
