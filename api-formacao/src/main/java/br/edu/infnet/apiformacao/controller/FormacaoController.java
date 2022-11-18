package br.edu.infnet.apiformacao.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.infnet.apiformacao.model.domain.Formacao;
import br.edu.infnet.apiformacao.service.FormacaoService;

@Controller
@RequestMapping("/api/formacao")
public class FormacaoController {
	
	@Autowired
	private FormacaoService formacaoService;
	
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Formacao formacao) {
		formacaoService.incluir(formacao);
	}

	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		formacaoService.excluir(id);
	}

	@GetMapping(value = "/listar")
	public Collection<Formacao> obterLista() {
		return formacaoService.obterLista();
	}
	
}
