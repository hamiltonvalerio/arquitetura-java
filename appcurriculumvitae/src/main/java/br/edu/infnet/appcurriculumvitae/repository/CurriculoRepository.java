package br.edu.infnet.appcurriculumvitae.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appcurriculumvitae.model.domain.Curriculo;

@Repository
public interface CurriculoRepository extends CrudRepository<Curriculo, Integer>{

}
