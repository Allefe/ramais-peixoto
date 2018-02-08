package com.peixoto.ramais.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.peixoto.ramais.repository.PessoaRepository;



@Controller
@RequestMapping(value="/contatospxt")
public class HomeController {
	
	@Autowired private PessoaRepository pessoarepo;
	
	@GetMapping
	public ModelAndView inicio(){
		ModelAndView mv = new ModelAndView("pages/listaramais/index");
		
		mv.addObject("pessoas", pessoarepo.findAll());
		
		return mv;
	}
	
	/*
	@GetMapping("/listar")
	public ModelAndView listar() {
		
		ModelAndView mv = new ModelAndView("pages/listaramais/index");
		
		mv.addObject("pessoas", pessoarepo.findAll());
		
		return mv;
	}*/
	
}
