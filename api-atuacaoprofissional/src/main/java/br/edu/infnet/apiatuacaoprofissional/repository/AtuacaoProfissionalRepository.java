package br.edu.infnet.apiatuacaoprofissional.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apiatuacaoprofissional.model.domain.AtuacaoProfissional;

@Repository
public interface AtuacaoProfissionalRepository extends CrudRepository<AtuacaoProfissional, Integer>{

}
