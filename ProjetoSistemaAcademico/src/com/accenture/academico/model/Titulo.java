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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="titulo")
@ManagedBean(name="tituloBean")
@SessionScoped
public class Titulo {
	
	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idTitulo;
	
	@Column(length=50)
	@NotNull
	private String titulo;
	
	@OneToMany(mappedBy = "titulo", targetEntity = Professor.class, fetch = FetchType.LAZY )
	private List<Professor> professores;

	public Titulo(){
		professores=new ArrayList<Professor>();
		
	}

	
	
	public int getIdTitulo() {
		return idTitulo;
	}

	public void setIdTitulo(int idTitulo) {
		this.idTitulo = idTitulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<Professor> getProfessor() {
		return professores;
	}

	public void setProfessor(List<Professor> professor) {
		this.professores = professor;
	}
}
