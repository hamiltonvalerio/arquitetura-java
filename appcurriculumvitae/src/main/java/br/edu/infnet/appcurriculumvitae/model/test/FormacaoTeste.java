package br.edu.infnet.appcurriculumvitae.model.test;

import java.time.LocalDate;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcurriculumvitae.model.domain.Formacao;

@Component
public class FormacaoTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Formacao f1 = new Formacao();
		Formacao f2 = new Formacao();
		Formacao f3 = new Formacao();
		
		f1.setInstituicao("Universidade Estatual do Mato Grosso do Sul");
		f1.setCurso("Ciência da Computação");
		f1.setNivel("Bacharelado");
		f1.setDataAlteracao(LocalDate.now());

		f2.setInstituicao("Universidade de Itapetininga");
		f2.setCurso("Administração");
		f2.setNivel("Bacharelado");
		f2.setDataAlteracao(LocalDate.now());
		
		f3.setInstituicao("Universidade da Bagunça");
		f3.setCurso("Zueira");
		f3.setNivel("Doutorado");
		f3.setDataAlteracao(LocalDate.now());
		
	}

}
