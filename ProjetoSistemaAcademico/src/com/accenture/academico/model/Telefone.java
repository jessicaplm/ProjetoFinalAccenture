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


@Entity
@Table(name="telefone")
@ManagedBean(name="telefoneBean")
@SessionScoped
public class Telefone {
	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idTelefone;
	@Column(length=3,nullable=false)
	private int ddd;
	@Column(length=10,nullable=false)
	private int telefone;
	
	@ManyToOne
	@JoinColumn(name = "idPerson")
	private Pessoa pessoa;
	
	public  Telefone(){
		
		pessoa=new Pessoa();
		
		
	}

	public int getIdTelefone() {
		return idTelefone;
	}

	public void setIdTelefone(int idTelefone) {
		this.idTelefone = idTelefone;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}
