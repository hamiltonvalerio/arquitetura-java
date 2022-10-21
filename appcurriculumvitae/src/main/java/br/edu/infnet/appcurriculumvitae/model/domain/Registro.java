package br.edu.infnet.appcurriculumvitae.model.domain;

import java.time.LocalDate;

public abstract class Registro {
	private long id;
	private LocalDate dataAlteracao;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public LocalDate getDataAlteracao() {
		return dataAlteracao;
	}
	public void setDataAlteracao(LocalDate dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}
	
	
}
