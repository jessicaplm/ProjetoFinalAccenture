package com.accenture.academico.model;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@ManagedBean(name="alunoBean")
@SessionScoped
@PrimaryKeyJoinColumn(name="idPerson")
@Table(name="aluno")
public class Aluno extends Pessoa{
	

	
	@Column(name="matriculaAluno")
	@GeneratedValue(strategy=GenerationType.AUTO)
	@NotNull
	private int matriculaAluno;
		
	@ManyToOne
	@JoinColumn(name = "idPerson" , insertable=false, updatable=false)
	private Professor professor;
	
	@OneToMany(mappedBy = "aluno", targetEntity = Publicacao.class, fetch = FetchType.LAZY )
	private List<Publicacao> publicacoes;
	
	public  Aluno(){
		
		publicacoes = new ArrayList<Publicacao>();
		professor=new Professor();
	}


	public int getMatriculaAluno() {
		return matriculaAluno;
	}

	public void setMatriculaAluno(int matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public List<Publicacao> getPublicacao() {
		return publicacoes;
	}

	public void setPublicacao(List<Publicacao> publicacao) {
		this.publicacoes = publicacao;
	}

}
