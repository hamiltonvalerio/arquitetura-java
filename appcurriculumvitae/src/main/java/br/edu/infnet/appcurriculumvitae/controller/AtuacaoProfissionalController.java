package br.edu.infnet.appcurriculumvitae.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AtuacaoProfissionalController {
	
	@GetMapping(value = "/atuacaoprofissional/lista")
	public String telaLista(Model model) {
		return "atuacaoprofissional/lista";
	}
	
}
