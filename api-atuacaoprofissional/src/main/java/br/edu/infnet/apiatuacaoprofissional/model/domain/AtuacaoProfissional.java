package br.edu.infnet.apiatuacaoprofissional.model.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "atuacaoprofissional")
public class AtuacaoProfissional{
	
	private String nomeEmpresa;
	private String cargo;
	private String funcao;
	private LocalDate dataInicio;
	private LocalDate dataFim;
	
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
	public LocalDate getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}
	public LocalDate getDataFim() {
		return dataFim;
	}
	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}
	@Override
	public String toString() {
		return "AtuacaoProfissional [nomeEmpresa=" + nomeEmpresa + ", cargo=" + cargo + ", funcao=" + funcao
				+ ", dataInicio=" + dataInicio + ", dataFim=" + dataFim + "]";
	}

}
