package com.momo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.momo.entities.Utente;
import com.momo.repos.UtenteDAO;

@Service
public class UtenteServiceImpl implements UtenteService {
	
	@Autowired
	UtenteDAO utenteDAO;

	@Override
	public Utente addUtente(Utente u) {
		return utenteDAO.save(u);
	}

	@Override
	public List<Utente> listaUtenti() {
		return utenteDAO.findAll();
	}

}
