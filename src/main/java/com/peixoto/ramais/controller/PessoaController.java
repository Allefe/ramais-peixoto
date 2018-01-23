package com.peixoto.ramais.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.peixoto.ramais.model.Pessoa;
import com.peixoto.ramais.repository.PessoaRepository;

@Controller
public class PessoaController {
	
	private PessoaController pessoacontroller;

	@Autowired
	public void setPessoaRepository(PessoaController pessoacontroller) {
		this.pessoacontroller = pessoacontroller;
		
	}
	
	@RequestMapping(path = {"/", "/index"})
    public String index() {
        return "index";
    }
	
	@RequestMapping(path = "/pessoas/adicionar", method = RequestMethod.GET)
    public String criarPessoa(Model mvc) {
        mvc.addAttribute("pessoa", new Pessoa());
        return "edit";
    }

    @PostMapping(path = "pessoas")
    public String salvarPessoa(Pessoa pessoa) {
       //PessoaRepository.save(Pessoa);
        return "redirect:/";
    }
    /*
    @RequestMapping(path = "/products", method = RequestMethod.GET)
    public String getAllProducts(Model model) {
        model.addAttribute("products", productRepository.findAll());
        return "products";
    }

    @RequestMapping(path = "/products/edit/{id}", method = RequestMethod.GET)
    public String editProduct(Model model, @PathVariable(value = "id") String id) {
        model.addAttribute("product", productRepository.findOne(id));
        return "edit";
    }

    @RequestMapping(path = "/products/delete/{id}", method = RequestMethod.GET)
    public String deleteProduct(@PathVariable(name = "id") String id) {
        productRepository.delete(id);
        return "redirect:/products";
    }
	*/
}
