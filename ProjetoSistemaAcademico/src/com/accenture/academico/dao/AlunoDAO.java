package com.accenture.academico.dao;

import java.util.List;

import com.accenture.academico.model.Aluno;


public interface AlunoDAO {
	public void addAluno(Aluno a );
	public List<Aluno> listAluno();
	public void updateAluno(Aluno a);
	public void removeAlunoById(int id );
}
