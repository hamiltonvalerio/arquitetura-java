package br.edu.infnet.appcurriculumvitae.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.infnet.appcurriculumvitae.model.domain.Projeto;

@FeignClient(url = "localhost:8083/api/projeto", name = "projetoClient")
public interface IProjetoClient {

	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Projeto projeto);
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id);
	
	@GetMapping(value = "/listar")
	public List<Projeto> obterLista();
	
}