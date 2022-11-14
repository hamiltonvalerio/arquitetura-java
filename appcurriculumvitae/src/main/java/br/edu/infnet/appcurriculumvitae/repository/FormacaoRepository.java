package br.edu.infnet.appcurriculumvitae.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appcurriculumvitae.model.domain.Formacao;

@Repository
public interface FormacaoRepository extends CrudRepository<Formacao, Integer>{

}
