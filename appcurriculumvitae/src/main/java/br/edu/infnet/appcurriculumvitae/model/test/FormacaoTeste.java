package br.edu.infnet.appcurriculumvitae.model.test;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcurriculumvitae.model.domain.Formacao;
import br.edu.infnet.appcurriculumvitae.service.FormacaoService;

@Component
@Order(3)
public class FormacaoTeste implements ApplicationRunner{

	@Autowired
	private FormacaoService formacaoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Formacao f1 = new Formacao();
		
		f1.setInstituicao("Universidade Estatual do Mato Grosso do Sul");
		f1.setCurso("Ciência da Computação");
		f1.setNivel("Bacharelado");
		f1.setDataAlteracao(LocalDate.now());
		formacaoService.incluir(f1);
		
	}

}
