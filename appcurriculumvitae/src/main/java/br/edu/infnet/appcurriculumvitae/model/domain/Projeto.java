package br.edu.infnet.appcurriculumvitae.model.domain;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "projeto")
public class Projeto extends Registro {

	private String titulo;

	private String descricao;

	private Timestamp dataInicio;

	private Timestamp dataFim;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Timestamp getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Timestamp dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Timestamp getDataFim() {
		return dataFim;
	}

	public void setDataFim(Timestamp dataFim) {
		this.dataFim = dataFim;
	}

	@Override
	public String toString() {
		return "Projeto [titulo=" + titulo + ", descricao=" + descricao + ", dataInicio=" + dataInicio + ", dataFim="
				+ dataFim + ", getDataAlteracao()=" + getDataAlteracao() + "]";
	}

}
