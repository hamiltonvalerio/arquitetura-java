package br.edu.infnet.appcurriculumvitae.model.test;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcurriculumvitae.model.domain.Candidato;
import br.edu.infnet.appcurriculumvitae.model.domain.Usuario;
import br.edu.infnet.appcurriculumvitae.service.CandidatoService;
import br.edu.infnet.appcurriculumvitae.service.UsuarioService;

@Component
@Order(2)
public class CandidatoTeste implements ApplicationRunner{
	
	@Autowired
	private CandidatoService candidatoService;
	
	@Autowired
	private UsuarioService usuarioService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Candidato ##");
		
				
		Candidato c1 = new Candidato();
		c1.setNome("Hamilton Valério");
		c1.setDataNascimento(LocalDate.of(1978, Month.JANUARY, 25));
		c1.setUsuario(1);
		candidatoService.incluir(c1);
		
	}

}
