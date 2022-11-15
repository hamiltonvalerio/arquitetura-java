package br.edu.infnet.appcurriculumvitae.model.test;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcurriculumvitae.model.domain.AtuacaoProfissional;
import br.edu.infnet.appcurriculumvitae.service.AtuacaoProfissionalService;

@Component
@Order(4)
public class AtuacaoProfissionalTeste implements ApplicationRunner{

	@Autowired
	private AtuacaoProfissionalService atuacaoProfissionalService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		AtuacaoProfissional ap1 = new AtuacaoProfissional();
		

		ap1.setNomeEmpresa("Avanade");
		ap1.setCargo("Consultor Sênior");
		ap1.setFuncao("Desenvolvedor Java");
		ap1.setDataInicio(LocalDate.of(2021, Month.OCTOBER, 07));
		ap1.setDataAlteracao(LocalDate.now());
		
		atuacaoProfissionalService.incluir(ap1);
	}

}
