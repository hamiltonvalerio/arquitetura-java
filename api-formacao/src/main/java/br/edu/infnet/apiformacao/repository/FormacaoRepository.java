package br.edu.infnet.apiformacao.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apiformacao.model.domain.Formacao;

@Repository
public interface FormacaoRepository extends CrudRepository<Formacao, Integer>{

}
