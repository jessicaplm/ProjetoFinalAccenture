package com.accenture.academico.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "publicacao")
@ManagedBean(name="publicacaoBean")
@SessionScoped
public class Publicacao {
	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPublicacao;
	
	@Column(length=100)
	@NotNull
	private String tituloPublicacao;
	
	@Column(length=500)
	@NotNull
	private String descricaoPublicacao;
	
	@Column
	private int idAluno;
	
	@Column
	private int idProfessor;
	
	@ManyToOne
	@JoinColumn(name = "idPerson")
	private Aluno aluno;
	
	@ManyToOne
	@JoinColumn(name = "idMeioComunicacao")
	private MeioComunicacao meioComunicacao;

	public Publicacao(){
		
		aluno= new Aluno();
		meioComunicacao= new MeioComunicacao();
	}
	
	
	public int getIdPublicacao() {
		return idPublicacao;
	}

	public void setIdPublicacao(int idPublicacao) {
		this.idPublicacao = idPublicacao;
	}

	public String getTituloPublicacao() {
		return tituloPublicacao;
	}

	public void setTituloPublicacao(String tituloPublicacao) {
		this.tituloPublicacao = tituloPublicacao;
	}

	public String getDescricaoPublicacao() {
		return descricaoPublicacao;
	}

	public void setDescricaoPublicacao(String descricaoPublicacao) {
		this.descricaoPublicacao = descricaoPublicacao;
	}

	public int getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}

	public int getIdProfessor() {
		return idProfessor;
	}

	public void setIdProfessor(int idProfessor) {
		this.idProfessor = idProfessor;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public MeioComunicacao getMeioComunicacao() {
		return meioComunicacao;
	}

	public void setMeioComunicacao(MeioComunicacao meioComunicacao) {
		this.meioComunicacao = meioComunicacao;
	}
}
