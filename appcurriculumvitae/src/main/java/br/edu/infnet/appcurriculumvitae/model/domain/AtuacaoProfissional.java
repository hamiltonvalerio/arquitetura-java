package br.edu.infnet.appcurriculumvitae.model.domain;

import java.sql.Timestamp;

public class AtuacaoProfissional extends Registro{
	
	private String nomeEmpresa;
	private String cargo;
	private String funcao;
	private Timestamp dataInicio;
	private Timestamp dataFim;
	
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
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
		return "AtuacaoProfissional [nomeEmpresa=" + nomeEmpresa + ", cargo=" + cargo + ", funcao=" + funcao
				+ ", dataInicio=" + dataInicio + ", dataFim=" + dataFim + ", getDataAlteracao()=" + getDataAlteracao()
				+ "]";
	}
	
	
}
