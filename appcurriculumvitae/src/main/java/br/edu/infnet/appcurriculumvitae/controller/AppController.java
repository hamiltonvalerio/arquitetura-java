package br.edu.infnet.appcurriculumvitae.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

	@GetMapping(value = "/")
	public String telaHome() {
		System.out.println("HOME");
		return "/home";
	}
	
}
