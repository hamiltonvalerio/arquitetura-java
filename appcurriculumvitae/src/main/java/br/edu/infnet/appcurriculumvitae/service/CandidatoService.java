package br.edu.infnet.appcurriculumvitae.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appcurriculumvitae.model.domain.Candidato;
import br.edu.infnet.appcurriculumvitae.repository.CandidatoRepository;

@Service
public class CandidatoService {
	
	@Autowired
	private CandidatoRepository candidatoRepository;
	
	public void incluir(Candidato candidato) {
		candidatoRepository.save(candidato);		
	}
	
	public void excluir(Integer id) {
		candidatoRepository.deleteById(id);
	}
	
	public Collection<Candidato> obterLista(){
		return (Collection<Candidato>) candidatoRepository.findAll();
	}
	
}
