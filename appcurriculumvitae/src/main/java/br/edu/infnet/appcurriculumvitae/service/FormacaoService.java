package br.edu.infnet.appcurriculumvitae.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appcurriculumvitae.clients.IFormacaoClient;
import br.edu.infnet.appcurriculumvitae.model.domain.Formacao;

@Service
public class FormacaoService {
	
	@Autowired
	private IFormacaoClient iFormacaoClient;
	
	public void incluir(Formacao formacao) {
		iFormacaoClient.incluir(formacao);
	}
	
	public void excluir(Integer id) {
		iFormacaoClient.excluir(id);
	}
	
	public Collection<Formacao> obterLista(){
		return iFormacaoClient.obterLista();
	}
}
