package br.edu.infnet.appcurriculumvitae.model.domain;

import java.time.LocalDate;
import java.util.Objects;

public class Canditato {
	
	private long id;
	private String nome;
	private LocalDate dataNascimento;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, nome);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Canditato other = (Canditato) obj;
		return id == other.id && Objects.equals(nome, other.nome);
	}
	
	@Override
	public String toString() {
		return "Canditato [id=" + id + ", nome=" + nome + ", dataNascimento=" + dataNascimento + "]";
	}
	
}
