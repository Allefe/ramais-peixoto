/*
package com.peixoto.ramais.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.peixoto.ramais.model.Setor;
import com.peixoto.ramais.repository.SetorRepository;

@Controller
public class SetorController {
	
	@Autowired public SetorRepository setorrepo;
	
	@GetMapping(path = "/setor/adicionar")
	public String createSetor(Model model) {
		model.addAttribute("setor", new Setor());
		return "setor";
	}

	@PostMapping(path = "/salvar/setor")
	public String salvarSetor(Setor setor) {
		setorrepo.save(setor);
		return "redirect:/";
	}

	@GetMapping(path = "/listar/setor")
	public String listarSetor(Model model) {
		model.addAttribute("setor", setorrepo.findAll());
		return "setor";
	}

	@GetMapping(path = "/setor/editar/{id}")
	public String editarSetor(Model model, @PathVariable(value = "id") Integer id) {
		model.addAttribute("setor", setorrepo.findOne(id));
		return "editar";
	}

	@GetMapping(path = "/setor/deletar/{id}")
	public String deletarSetor(@PathVariable(name = "id") Integer id) {
		setorrepo.delete(id);
		return "redirect:/setor";
	}
}*/
