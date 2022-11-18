package br.edu.infnet.apiprojeto.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.infnet.apiprojeto.model.domain.Projeto;
import br.edu.infnet.apiprojeto.service.ProjetoService;

@Controller
@RequestMapping("/api/projeto")
public class ProjetoController {
	
	@Autowired
	private ProjetoService projetoService; 
	
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Projeto projeto) {
		projetoService.incluir(projeto);
	}

	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		projetoService.excluir(id);
	}

	@GetMapping(value = "/listar")
	public Collection<Projeto> obterLista() {
		return projetoService.obterLista();
	}
	
}
