package br.edu.infnet.appcurriculumvitae.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcurriculumvitae.model.domain.AtuacaoProfissional;

@Component
public class AtuacaoProfissionalTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		AtuacaoProfissional ap1 = new AtuacaoProfissional();
		AtuacaoProfissional ap2 = new AtuacaoProfissional();
		AtuacaoProfissional ap3 = new AtuacaoProfissional();

		ap1.setNomeEmpresa("Avanade");
		ap1.setCargo("Consultor Sênior");
		ap1.setFuncao("Desenvolvedor Java");
		
		
	}

}
