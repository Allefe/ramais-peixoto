package com.peixoto.ramais.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.peixoto.ramais.model.Funcao;
import com.peixoto.ramais.repository.FuncaoRepository;

@Controller
public class FuncaoController {
	
	@Autowired public FuncaoRepository funcaorepo;
	
	@GetMapping(path = "/funcao/adicionar")
    public String createFuncao(Model model) {
        model.addAttribute("funcao", new Funcao());
        return "funcao";
    }
	
	
	@PostMapping(path = "/salvar/funcao")
    public String salvarFuncao(Funcao funcao) {
        funcaorepo.save(funcao);
        return "redirect:/funcao";
    }
	
	 @GetMapping(path = "/listar/funcoes")
	    public String listarFuncoes(Model model) {
	        model.addAttribute("funcoes", funcaorepo.findAll());
	        return "funcoes";
	    }

	    @GetMapping(path = "/funcao/editar/{id}")
	    public String editarFuncao(Model model, @PathVariable(value = "id") Integer id) {
	        model.addAttribute("funcao", funcaorepo.findOne(id));
	        return "editar";
	    }

	    @GetMapping(path = "/funcoes/deletar/{id}")
	    public String deletarFuncao(@PathVariable(name = "id") Integer id) {
	        funcaorepo.delete(id);
	        return "redirect:/funcoes";
	    }
}
