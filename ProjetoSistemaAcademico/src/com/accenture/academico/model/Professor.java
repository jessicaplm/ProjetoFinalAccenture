package com.accenture.academico.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@PrimaryKeyJoinColumn(name = "idPerson")
@Table(name = "professor")
@ManagedBean(name="professorBean")
@SessionScoped
public class Professor extends Pessoa {

	@Column
	@NotNull
	private String instituicaoEnsino;

	@Column
	@NotNull
	private Date dataAdmissao;

	@Column(length = 100)
	private String titulacao;

	@OneToMany(mappedBy = "professor", targetEntity = Aluno.class, fetch = FetchType.LAZY)
	private List<Aluno> alunos;

	@ManyToOne
	@JoinColumn(name = "idTitulo")
	private Titulo titulo;
	
	public  Professor(){
		
		alunos=new ArrayList<Aluno>();
		titulo=new Titulo();
	}
	
	

	public String getInstituicaoEnsino() {
		return instituicaoEnsino;
	}

	public void setInstituicaoEnsino(String instituicaoEnsino) {
		this.instituicaoEnsino = instituicaoEnsino;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	public List<Aluno> getAluno() {
		return alunos;
	}

	public void setAluno(List<Aluno> aluno) {
		this.alunos = aluno;
	}

	public Titulo getTitulo() {
		return titulo;
	}

	public void setTitulo(Titulo titulo) {
		this.titulo = titulo;
	}

}
