package br.edu.infnet.appcurriculumvitae.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.appcurriculumvitae.model.domain.Usuario;

@FeignClient(url = "localhost:8081/api/usuario", name = "usuarioClient")
public interface IUsuarioClient {

	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Usuario usuario);
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id);
	
	@GetMapping(value = "/listar")
	public List<Usuario> obterLista();
	
	@PostMapping(value = "/validar")
	public Usuario validar(@RequestParam String email, @RequestParam String senha);
}