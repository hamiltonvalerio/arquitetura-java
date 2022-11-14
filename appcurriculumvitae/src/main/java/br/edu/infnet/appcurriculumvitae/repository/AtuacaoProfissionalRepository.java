package br.edu.infnet.appcurriculumvitae.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appcurriculumvitae.model.domain.AtuacaoProfissional;

@Repository
public interface AtuacaoProfissionalRepository extends CrudRepository<AtuacaoProfissional, Integer>{

}
