package br.edu.infnet.appcurriculumvitae.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appcurriculumvitae.model.domain.Canditato;

@Repository
public interface CandidatoRepository extends CrudRepository<Canditato, Integer>{

}
