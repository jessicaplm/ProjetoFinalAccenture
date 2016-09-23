package com.accenture.academico.service;

import java.util.List;

import com.accenture.academico.model.Professor;

public interface ProfessorService {
	public void addProfessor(Professor p );
	public List<Professor> listProfessor();
	public void updateProfessor(Professor p);
	public void removeProfessorById(int id );
}
