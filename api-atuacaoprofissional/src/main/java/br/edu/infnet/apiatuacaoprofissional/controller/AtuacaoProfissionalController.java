package br.edu.infnet.apiatuacaoprofissional.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.infnet.apiatuacaoprofissional.model.domain.AtuacaoProfissional;
import br.edu.infnet.apiatuacaoprofissional.service.AtuacaoProfissionalService;

@Controller
@RequestMapping("/api/atuacaoprofissional")
public class AtuacaoProfissionalController {
	
	@Autowired
	private AtuacaoProfissionalService atuacaoProfissionalService;
	
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody AtuacaoProfissional atuacaoProfissional) {
		atuacaoProfissionalService.incluir(atuacaoProfissional);
	}

	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		atuacaoProfissionalService.excluir(id);
	}

	@GetMapping(value = "/listar")
	public Collection<AtuacaoProfissional> obterLista() {
		return atuacaoProfissionalService.obterLista();
	}
	
}
