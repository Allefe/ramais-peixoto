package com.peixoto.ramais.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.peixoto.ramais.repository.EmpresaRepository;

@Controller
public class PaginasController {
	
	@Autowired EmpresaRepository empresaRepo;
	
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
	
	@GetMapping (value = "/login")
	public ModelAndView Login(){
		ModelAndView mv = new ModelAndView("pages/login");
		return mv;
	}
	
	//classe para testes....
	@GetMapping (value = "/teste")
	public ModelAndView teste(){
		ModelAndView mv = new ModelAndView("pages/listaramais/teste");
		return mv;
	}

	//classe para testes....
	@GetMapping (value = "/teste2")
	public ModelAndView teste2(){
		ModelAndView mv = new ModelAndView("pages/listaramais/teste2");
		return mv;
	}
	
	@GetMapping (value = "/maps/{id}")
	public ModelAndView Maps(@PathVariable("id") Integer id){
		ModelAndView mv = new ModelAndView("fragments/mapa/maps");
		mv.addObject("empresaSelecionada", empresaRepo.findOne(id));
		return mv;
	}
}
