package br.edu.infnet.apiatuacaoprofissional.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apiatuacaoprofissional.model.domain.AtuacaoProfissional;
import br.edu.infnet.apiatuacaoprofissional.repository.AtuacaoProfissionalRepository;

@Service
public class AtuacaoProfissionalService {
	
	@Autowired
	private AtuacaoProfissionalRepository atuacaoProfissionalRepository;
	
	public void incluir(AtuacaoProfissional atuacaoProfissional) {
		atuacaoProfissionalRepository.save(atuacaoProfissional);		
	}
	
	public void excluir(Integer id) {
		atuacaoProfissionalRepository.deleteById(id);
	}
	
	public Collection<AtuacaoProfissional> obterLista(){
		return (Collection<AtuacaoProfissional>) atuacaoProfissionalRepository.findAll();
	}
	
}
