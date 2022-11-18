package br.edu.infnet.appcurriculumvitae.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appcurriculumvitae.clients.IAtuacaoProfissionalClient;
import br.edu.infnet.appcurriculumvitae.model.domain.AtuacaoProfissional;

@Service
public class AtuacaoProfissionalService {
	
	@Autowired
	private IAtuacaoProfissionalClient atuacaoProfissionalClient;
	
	public void incluir(AtuacaoProfissional atuacaoProfissional) {
		atuacaoProfissionalClient.incluir(atuacaoProfissional);
	}
	
	public void excluir(Integer id) {
		atuacaoProfissionalClient.excluir(id);
	}
	
	public Collection<AtuacaoProfissional> obterLista(){
		return atuacaoProfissionalClient.obterLista();
	}
	
}
