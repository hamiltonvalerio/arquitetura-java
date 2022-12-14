package br.edu.infnet.apiprojeto.model.domain;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "projeto")
public class Projeto{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String titulo;

	private String descricao;

	private Timestamp dataInicio;

	private Timestamp dataFim;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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
				+ dataFim + "]";
	}

}
