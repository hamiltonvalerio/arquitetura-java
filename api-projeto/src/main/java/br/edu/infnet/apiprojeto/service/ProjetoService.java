package br.edu.infnet.apiprojeto.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apiprojeto.model.domain.Projeto;
import br.edu.infnet.apiprojeto.repository.ProjetoRepository;

@Service
public class ProjetoService {
	
	@Autowired
	private ProjetoRepository projetoRepository;
	
	public void incluir(Projeto projeto) {
		projetoRepository.save(projeto);		
	}
	
	public void excluir(Integer id) {
		projetoRepository.deleteById(id);
	}
	
	public Collection<Projeto> obterLista(){
		return (Collection<Projeto>) projetoRepository.findAll();
	}
}
