package br.edu.infnet.appcurriculumvitae.model.test;

import java.time.LocalDate;
import java.time.Month;

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
		ap1.setDataInicio(LocalDate.of(2021, Month.OCTOBER, 07));
		ap1.setDataAlteracao(LocalDate.now());
		
		ap2.setNomeEmpresa("Empresa XPTO");
		ap2.setCargo("Administradora");
		ap2.setFuncao("Administradora");
		ap2.setDataInicio(LocalDate.of(2016, Month.OCTOBER, 10));
		ap2.setDataAlteracao(LocalDate.now());
		
		ap3.setNomeEmpresa("Empresa XPTOZ");
		ap3.setCargo("Bagunçeira");
		ap3.setFuncao("Bagunçeira");
		ap3.setDataInicio(LocalDate.of(2018, Month.JANUARY, 29));
		ap3.setDataAlteracao(LocalDate.now());
		
		
		
		
	}

}
