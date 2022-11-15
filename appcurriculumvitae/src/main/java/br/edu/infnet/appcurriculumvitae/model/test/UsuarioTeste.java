package br.edu.infnet.appcurriculumvitae.model.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcurriculumvitae.model.domain.Usuario;
import br.edu.infnet.appcurriculumvitae.service.UsuarioService;

@Component
@Order(1)
public class UsuarioTeste implements ApplicationRunner {

	@Autowired
	private UsuarioService usuarioService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Usuários ##");
		
		Usuario u1 = new Usuario();
		u1.setEmail("htecmac@gmail.com");
		u1.setNome("hamilton");
		u1.setSenha("123456");
		usuarioService.incluir(u1);
	}
}