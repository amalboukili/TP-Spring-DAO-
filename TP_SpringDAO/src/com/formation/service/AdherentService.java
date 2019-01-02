package com.formation.service;

import java.util.ArrayList;
import java.util.Map;

import com.formation.dao.IAdherentDao;
import com.formation.modele.Adherent;

public class AdherentService implements IAdherentService{

	IAdherentDao dao;
	
	
	public IAdherentDao getDao() {
		return dao;
	}

	public void setDao(IAdherentDao dao) {
		this.dao = dao;
	}

	@Override
	public int addAdherent(Adherent a) {
		// TODO Auto-generated method stub
		return dao.addAdherent(a);
	}

	@Override
	public Adherent getAdherentByCode(String codeAdherent) {
		// TODO Auto-generated method stub
		return dao.getAdherentByCode(codeAdherent);
	}

	@Override
	public int removeAdherent(String codeAdherent) {
		// TODO Auto-generated method stub
		return dao.removeAdherent(codeAdherent);
	}

	@Override
	public ArrayList<Map<String, Object>> getAllAdherent() {
		// TODO Auto-generated method stub
		return dao.getAllAdherent();
	}
	

}
																																																																																																																																																																																																																																																																																		