package com.momo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.momo.entities.Utente;
import com.momo.repo.UtenteDAO;

@Service
public class UtenteServiceImpl implements UtenteService {

	@Autowired
	UtenteDAO daoUtente;

	@Override
	public Utente addUtente(Utente u) {
		return daoUtente.save(u);
	}

	@Override
	public List<Utente> getUtenti() {
		return daoUtente.findAll();
	}

	@Override
	public void deleteUtente(int id) {
		daoUtente.deleteById(id);
		
	}

//	@Override
//	public Optional<Utente> getUtenteByEmailAndPw(String email, String password) {
//		return Optional.ofNullable(null);
//	}

}
