package br.edu.infnet.apiprojeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import br.edu.infnet.apiprojeto.model.domain.Projeto;

@Controller
public class ProjetoController {
	
	@GetMapping(value = "/projeto/lista")
	public String telaLista(Model model) {
		return "projeto/lista";
	}
	
	@PostMapping(value = "/projeto/salvar")
	public RedirectView inserirProjeto(@ModelAttribute("projeto") Projeto projeto) {
		final RedirectView redirectView = new RedirectView("/projeto/salvar", true);
		return redirectView;
	}
	
	@GetMapping(value = "/projeto/buscar/{titulo}")
	public Projeto buscarProjeto(@PathVariable("titulo") String titulo) {
		return null;
	}
	
}
