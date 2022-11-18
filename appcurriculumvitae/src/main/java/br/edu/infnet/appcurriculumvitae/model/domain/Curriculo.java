package br.edu.infnet.appcurriculumvitae.model.domain;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "curriculo")
public class Curriculo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String nome;

	private String resumo;

	@OneToOne(cascade = CascadeType.DETACH) 
	@JoinColumn(name = "idCandidato")
	private Candidato canditato;

	@ManyToMany(cascade = CascadeType.DETACH)
	private List<Registro> registros;

	private Timestamp dataAlteracao;

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

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public Candidato getCanditato() {
		return canditato;
	}

	public void setCanditato(Candidato canditato) {
		this.canditato = canditato;
	}

	public Timestamp getDataAlteracao() {
		return dataAlteracao;
	}

	public void setDataAlteracao(Timestamp dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}

	public List<Registro> getRegistros() {
		return registros;
	}

	public void setRegistros(List<Registro> registros) {
		this.registros = registros;
	}

	

}
