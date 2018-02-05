package com.peixoto.ramais.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.peixoto.ramais.model.Filial;
import com.peixoto.ramais.repository.FilialRepository;

@Controller
public class FilialController {
	
@Autowired public FilialRepository filialrepo;
	

	@GetMapping(path = "/filial/adicionar")
    public String createFilial(Model model) {
        model.addAttribute("filial", new Filial());
        return "filial";
    }
	
	
	@PostMapping(path = "/salvar/filiais")
    public String salvarFilial(Filial filial) {
        filialrepo.save(filial);
        return "redirect:/filiais";
    }
	
	 @GetMapping(path = "/listar/filiais")
	    public String listarFiliais(Model model) {
	        model.addAttribute("filiais", filialrepo.findAll());
	        return "filiais";
	    }

	    @GetMapping(path = "/filiais/editar/{id}")
	    public String editarFilial(Model model, @PathVariable(value = "id") Integer id) {
	        model.addAttribute("filial", filialrepo.findOne(id));
	        return "editar";
	    }

	    @GetMapping(path = "/filiais/deletar/{id}")
	    public String deletarFilial(@PathVariable(name = "id") Integer id) {
	        filialrepo.delete(id);
	        return "redirect:/filiais";
	    }
}
