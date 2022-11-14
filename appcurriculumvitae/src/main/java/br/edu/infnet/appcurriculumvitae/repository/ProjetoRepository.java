package br.edu.infnet.appcurriculumvitae.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appcurriculumvitae.model.domain.Projeto;

@Repository
public interface ProjetoRepository extends CrudRepository<Projeto, Integer>{

}
