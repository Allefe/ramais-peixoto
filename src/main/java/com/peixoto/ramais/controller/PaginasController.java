package com.peixoto.ramais.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PaginasController {
	
	
	@GetMapping (value = "/admintools")
	public ModelAndView index(){
		ModelAndView mv = new ModelAndView("pages/listaramaisadmin/index");
		return mv;
	}
	
	@GetMapping (value = "/filiais")
	public ModelAndView filiais(){
		ModelAndView mv = new ModelAndView("pages/listaramaisadmin/filiais");
		return mv;
	}
	
	@GetMapping (value = "/ramais")
	public ModelAndView ramais(){
		ModelAndView mv = new ModelAndView("pages/listaramaisadmin/ramais");
		return mv;
	}
	
	@GetMapping (value = "/gerentesvendas")
	public ModelAndView gerentesvendas(){
		ModelAndView mv = new ModelAndView("pages/listaramaisadmin/gerentesvendas");
		return mv;
	}
	
	@GetMapping (value = "/terceiros")
	public ModelAndView terceiros(){
		ModelAndView mv = new ModelAndView("pages/listaramaisadmin/terceiros");
		return mv;
	}
	
	@GetMapping (value = "/cadastrofilial")
	public ModelAndView cadastroFilial(){
		ModelAndView mv = new ModelAndView("pages/listaramaisadmin/cadastrofilial");
		return mv;
	}
	
	@GetMapping (value = "/cadastrofuncoes")
	public ModelAndView cadastroFuncoes(){
		ModelAndView mv = new ModelAndView("pages/listaramaisadmin/cadastrofuncoes");
		return mv;
	}
	
	@GetMapping (value = "/cadastrosetores")
	public ModelAndView cadastroSetores(){
		ModelAndView mv = new ModelAndView("pages/listaramaisadmin/cadastrosetores");
		return mv;
	}
	
	//classe para testes....
	@GetMapping (value = "/teste")
	public ModelAndView teste(){
		ModelAndView mv = new ModelAndView("pages/listaramais/teste");
		return mv;
	}

	
}
