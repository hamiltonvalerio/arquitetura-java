package br.edu.infnet.appcurriculumvitae.model.domain;

import java.sql.Timestamp;
import java.util.List;

public class Curriculo {
	
	private long id;
	private String nome;
	private String resumo;
	private Canditato canditato;
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
	public Canditato getCanditato() {
		return canditato;
	}
	public void setCanditato(Canditato canditato) {
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
	@Override
	public String toString() {
		return "Curriculo [id=" + id + ", nome=" + nome + ", resumo=" + resumo + ", canditato=" + canditato
				+ ", formacoes=" + formacoes + ", atuacoesProfissionais=" + atuacoesProfissionais + ", projetos="
				+ projetos + ", dataAlteracao=" + dataAlteracao + "]";
	}
	
	
}
