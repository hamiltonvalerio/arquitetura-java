package br.edu.infnet.appcurriculumvitae.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormacaoController {
	
	@GetMapping(value = "/formacao/lista")
	public String telaLista() {
		return "formacao/lista";
	}
	
}
