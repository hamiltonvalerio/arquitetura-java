package br.edu.infnet.appcurriculumvitae.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appcurriculumvitae.clients.IProjetoClient;
import br.edu.infnet.appcurriculumvitae.model.domain.Projeto;

@Service
public class ProjetoService {
	
	@Autowired
	private IProjetoClient iProjetoClient;
	
	public void incluir(Projeto projeto) {
		iProjetoClient.incluir(projeto);
	}
	
	public void excluir(Integer id) {
		iProjetoClient.excluir(id);
	}
	
	public Collection<Projeto> obterLista(){
		return iProjetoClient.obterLista();
	}
	
}
