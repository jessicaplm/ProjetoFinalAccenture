package com.accenture.academico.model;

public enum Sexo {

	Feminino("F"), Masculino("M"), outros("Outros");

	private final String valor;

	Sexo(String valorOpcao) {
		// TODO Auto-generated constructor stub
		valor = valorOpcao;
	}

	public String getValor() {
		return valor;
	}
}
