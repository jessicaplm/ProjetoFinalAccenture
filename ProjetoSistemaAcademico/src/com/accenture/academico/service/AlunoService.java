package com.accenture.academico.service;

import java.util.List;

import com.accenture.academico.model.Aluno;

public interface AlunoService {
	public void addAluno(Aluno a );
	public List<Aluno> listAluno();
	public void updateAluno(Aluno a);
	public void removeAlunoById(int id );
}
