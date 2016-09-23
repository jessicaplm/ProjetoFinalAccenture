package com.accenture.academico.model;

public enum Cidade {

	Caruaru("Caruaru"),
	Recife("Recife"),
	Olinda("Olinda"),
	Jaboatao("Jaboatao dos Guararapes"),
	Petrolina("Petrolina"),
	Garanhuns("Garanhuns"),
	Camaragibe("Camaragibe"),
	Arcoverde("Arcoverde"),
	Gravata("Gravata"),
	Bezerros("Bezerros"),
	;
	
	private final String valor;

	Cidade(String valorOpcao) {
		// TODO Auto-generated method stub
		valor = valorOpcao;
	}
	
	public String getValor(){
		return valor;
	}
	
}
