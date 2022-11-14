package br.edu.infnet.appcurriculumvitae.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appcurriculumvitae.model.domain.Curriculo;
import br.edu.infnet.appcurriculumvitae.repository.CurriculoRepository;

@Service
public class CurriculoService {
	
	@Autowired
	private CurriculoRepository curriculoRepository;
	
	public void incluir(Curriculo curriculo) {
		curriculoRepository.save(curriculo);		
	}
	
	public void excluir(Integer id) {
		curriculoRepository.deleteById(id);
	}
	
	public Collection<Curriculo> obterLista(){
		return (Collection<Curriculo>) curriculoRepository.findAll();
	}
}
