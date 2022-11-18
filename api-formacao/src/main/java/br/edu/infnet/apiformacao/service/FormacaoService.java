package br.edu.infnet.apiformacao.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apiformacao.model.domain.Formacao;
import br.edu.infnet.apiformacao.repository.FormacaoRepository;

@Service
public class FormacaoService {

	@Autowired
	private FormacaoRepository formacaoRepository;
	
	public void incluir(Formacao formacao) {
		formacaoRepository.save(formacao);		
	}
	
	public void excluir(Integer id) {
		formacaoRepository.deleteById(id);
	}
	
	public Collection<Formacao> obterLista(){
		return (Collection<Formacao>) formacaoRepository.findAll();
	}
}
