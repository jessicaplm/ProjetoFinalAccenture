package com.accenture.academico.dao;

import java.util.List;

import com.accenture.academico.model.Professor;

public interface ProfessorDAO {
	public void addProfessor(Professor p );
	public List<Professor> listProfessor();
	public void updateProfessor(Professor p);
	public void removeProfessorById(int id );
}
