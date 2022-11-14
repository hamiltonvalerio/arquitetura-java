package br.edu.infnet.appcurriculumvitae.model.test;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcurriculumvitae.model.domain.Candidato;

@Component
public class CandidatoTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
	
		Candidato c1 = new Candidato();
		Candidato c2 = new Candidato();
		Candidato c3 = new Candidato();
		
		c1.setNome("Hamilton Valério");
		c1.setDataNascimento(LocalDate.of(1978, Month.JANUARY, 25));

		c2.setNome("Graziela Valério");
		c2.setDataNascimento(LocalDate.of(1983, Month.MARCH, 18));

		c3.setNome("Valentina Valério");
		c3.setDataNascimento(LocalDate.of(2018, Month.JANUARY, 29));
		
	}

}
