package br.edu.infnet.apiatuacaoprofissional.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.apiatuacaoprofissional.service.AtuacaoProfissionalService;

@Controller
public class AtuacaoProfissionalController {
	
	@Autowired
	private AtuacaoProfissionalService atuacaoProfissionalService;
	
	@GetMapping(value = "/atuacaoprofissional/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", atuacaoProfissionalService.obterLista());
		
		return "atuacaoprofissional/lista";
	}
	
}
