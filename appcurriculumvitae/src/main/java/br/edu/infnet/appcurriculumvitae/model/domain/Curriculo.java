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

	private List<Formacao> formacoes;

	private List<AtuacaoProfissional> atuacoesProfissionais;

	private List<Projeto> projetos;

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

	public List<Formacao> getFormacoes() {
		return formacoes;
	}

	public void setFormacoes(List<Formacao> formacoes) {
		this.formacoes = formacoes;
	}

	public List<AtuacaoProfissional> getAtuacoesProfissionais() {
		return atuacoesProfissionais;
	}

	public void setAtuacoesProfissionais(List<AtuacaoProfissional> atuacoesProfissionais) {
		this.atuacoesProfissionais = atuacoesProfissionais;
	}

	public List<Projeto> getProjetos() {
		return projetos;
	}

	public void setProjetos(List<Projeto> projetos) {
		this.projetos = projetos;
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

	@Override
	public String toString() {
		return "Curriculo [id=" + id + ", nome=" + nome + ", resumo=" + resumo + ", canditato=" + canditato
				+ ", formacoes=" + formacoes + ", atuacoesProfissionais=" + atuacoesProfissionais + ", projetos="
				+ projetos + ", dataAlteracao=" + dataAlteracao + "]";
	}

}
