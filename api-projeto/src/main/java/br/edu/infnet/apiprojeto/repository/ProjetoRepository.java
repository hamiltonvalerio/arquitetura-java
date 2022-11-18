package br.edu.infnet.apiprojeto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apiprojeto.model.domain.Projeto;

@Repository
public interface ProjetoRepository extends CrudRepository<Projeto, Integer>{

}
