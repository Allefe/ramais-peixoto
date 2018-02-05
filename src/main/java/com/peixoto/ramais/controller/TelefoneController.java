package com.peixoto.ramais.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.peixoto.ramais.model.Telefone;
import com.peixoto.ramais.repository.TelefoneRepository;

@Controller
public class TelefoneController {
	
	@Autowired public TelefoneRepository telrepo;
	
	@GetMapping(path = "/telefone/adicionar")
	public String createTelefone(Model model) {
		model.addAttribute("telefon", new Telefone());
		return "telefone";
	}

	@PostMapping(path = "/salvar/telefones")
	public String salvarTelefone(Telefone telefone) {
		telrepo.save(telefone);
		return "redirect:/";
	}

	@GetMapping(path = "/listar/telefones")
	public String listarTelefones(Model model) {
		model.addAttribute("telefones", telrepo.findAll());
		return "telefones";
	}

	@GetMapping(path = "/telefone/editar/{id}")
	public String editarTelefone(Model model, @PathVariable(value = "id") Integer id) {
		model.addAttribute("pessoa", telrepo.findOne(id));
		return "editar";
	}

	@GetMapping(path = "/telefones/deletar/{id}")
	public String deletarTelefone(@PathVariable(name = "id") Integer id) {
		telrepo.delete(id);
		return "redirect:/telefones";
	}
}
