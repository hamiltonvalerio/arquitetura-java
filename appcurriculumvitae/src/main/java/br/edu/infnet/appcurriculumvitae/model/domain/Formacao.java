package br.edu.infnet.appcurriculumvitae.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "formacao")
public class Formacao extends Registro {

	private String instituicao;
	
	private String curso;
	
	private String nivel;


	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	@Override
	public String toString() {
		return "Formacao [instituicao=" + instituicao + ", curso=" + curso + ", nivel=" + nivel
				+ ", getDataAlteracao()=" + getDataAlteracao() + "]";
	}

}
