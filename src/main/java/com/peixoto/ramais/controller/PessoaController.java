package com.peixoto.ramais.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.peixoto.ramais.model.Pessoa;
import com.peixoto.ramais.repository.PessoaRepository;

@Controller
public class PessoaController {

	@Autowired
	public PessoaRepository pessoarepo;

	@GetMapping(path = "/pessoa/adicionar")
	public String createPessoa(Model model) {
		model.addAttribute("pessoa", new Pessoa());
		return "pessoa";
	}

	@PostMapping(path = "/salvar/pessoas")
	public String salvarPessoa(Pessoa pessoa) {
		pessoarepo.save(pessoa);
		return "redirect:/";
	}

	@GetMapping(path = "/listar/pessoas")
	public String listarPessoa(Model model) {
		model.addAttribute("pessoas", pessoarepo.findAll());
		return "pessoas";
	}

	@GetMapping(path = "/pessoas/editar/{id}")
	public String editarPessoa(Model model, @PathVariable(value = "id") Integer id) {
		model.addAttribute("pessoa", pessoarepo.findOne(id));
		return "editar";
	}

	@GetMapping(path = "/pessoas/deletar/{id}")
	public String deletarPessoa(@PathVariable(name = "id") Integer id) {
		pessoarepo.delete(id);
		return "redirect:/pessoas";
	}
}
