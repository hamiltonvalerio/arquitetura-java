package br.edu.infnet.appcurriculumvitae.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;

import br.edu.infnet.appcurriculumvitae.model.domain.Usuario;
import br.edu.infnet.appcurriculumvitae.service.UsuarioService;

@Controller
public class AppController {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping(value = "/")
	public String telaHome() {
		System.out.println("HOME");
		return "/home";
	}
	
	@GetMapping(value = "/login")
	public String telaLogin() {
		return "login";
	}
	
	@PostMapping(value = "/login")
	public String login(Model model, @RequestParam String email, @RequestParam String senha) {
		
		Usuario usuario = usuarioService.validar(email, senha);
		
		if(usuario != null) {
			
			model.addAttribute("user", usuario);
			
			return "home";
		}
		
		return "login";
	}
	
	@GetMapping(value = "/logout")
	public String logout(HttpSession session, SessionStatus status) {
		
		status.setComplete();
		
		session.removeAttribute("user");
		
		return "redirect:/";
	}
}
