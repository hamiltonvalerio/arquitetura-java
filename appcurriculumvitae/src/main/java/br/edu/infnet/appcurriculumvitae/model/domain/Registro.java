package br.edu.infnet.appcurriculumvitae.model.domain;

import java.sql.Timestamp;

public abstract class Registro {
	private long id;
	private Timestamp dataAlteracao;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Timestamp getDataAlteracao() {
		return dataAlteracao;
	}
	public void setDataAlteracao(Timestamp dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}
	
	
}
