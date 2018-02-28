package com.peixoto.ramais.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.peixoto.ramais.model.Empresa;
import com.peixoto.ramais.repository.EmpresaRepository;

@Controller
public class EmpresaController {
	
	@Autowired public EmpresaRepository empresarepo;
	
	
	@GetMapping(path = "/empresa/adicionar")
    public String createEmpresa(Model model) {
        model.addAttribute("empresa", new Empresa());
        return "empresa";
    }
	
	
	@PostMapping(path = "/salvar/empresas")
	//Recebe um multipartfile com o nome de imagem definido no form de envio
    public String salvarEmpresa(MultipartFile imagem, Empresa empresa) {
		
		//Irá exibir no console o nome original do arquivo
		System.out.print(imagem.getOriginalFilename());
		
        empresarepo.save(empresa);
        return "redirect:/empresas";
        
        
    }
	
	 @GetMapping(path = "/listar/empresas")
	    public String listarEmpresas(Model model) {
	        model.addAttribute("empresas", empresarepo.findAll());
	        return "empresas";
	    }

	    @GetMapping(path = "/empresas/editar/{id}")
	    public String editarEmpresa(Model model, @PathVariable(value = "id") Integer id) {
	        model.addAttribute("empresa", empresarepo.findOne(id));
	        return "editar";
	    }

	    @GetMapping(path = "/empresas/deletar/{id}")
	    public String deletarEmpresas(@PathVariable(name = "id") Integer id) {
	        empresarepo.delete(id);
	        return "redirect:/empresas";
	    }
}
