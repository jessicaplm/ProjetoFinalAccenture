package com.accenture.academico.service;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accenture.academico.dao.MeioComunicacaoDAO;
import com.accenture.academico.model.MeioComunicacao;



@Service
@Transactional(readOnly = true)
public class MeioComunicacaoServiceImpl implements MeioComunicacaoService {
	
	private MeioComunicacaoDAO meioComunicacaoDAO;

	public void setMeioComunicacaoDAO(MeioComunicacaoDAO meioComunicacaoDAO) {
		this.meioComunicacaoDAO = meioComunicacaoDAO;
	}

	@Override
	@Transactional(readOnly = false)
	public void createMeioComunicacao(MeioComunicacao mc) {
		meioComunicacaoDAO.createMeioComunicacao(mc);
		
	}

	@Override
	@Transactional(readOnly = false)
	public void updateMeioComunicacao(MeioComunicacao mc) {
		meioComunicacaoDAO.updateMeioComunicacao(mc);
		
	}

	@Override
	@Transactional(readOnly = false)
	public void removeMeioComunicacao(int id) {
		meioComunicacaoDAO.removeMeioComunicacao(id);
		
	}

	@Override
	public List<MeioComunicacao> listMeioComunicacao() {
		// TODO Auto-generated method stub
		return meioComunicacaoDAO.listMeioComunicacao();
	}

}
