package br.edu.infnet.appcurriculumvitae.model.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcurriculumvitae.model.domain.Projeto;
import br.edu.infnet.appcurriculumvitae.service.ProjetoService;

@Component
@Order(4)
public class ProjetoTeste implements ApplicationRunner{

	@Autowired
	private ProjetoService projetoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Projeto p = new Projeto();
		
		p.setTitulo("Arquitetura Java");
		p.setDescricao("Projeto da disciplina Arquitetura Java");
		projetoService.incluir(p);
		
	}

}
