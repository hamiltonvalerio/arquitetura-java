package br.edu.infnet.appcurriculumvitae.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjetoController {
	
	@GetMapping(value = "/projeto/lista")
	public String telaLista() {
		return "projeto/lista";
	}
	
}
