package br.edu.infnet.appcurriculumvitae.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CandidatoController {
	
	@GetMapping(value = "/candidato/lista")
	public String telaLista(Model model) {
		return "candidato/lista";
	}
	
}
