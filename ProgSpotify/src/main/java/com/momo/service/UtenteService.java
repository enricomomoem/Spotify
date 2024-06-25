package com.momo.service;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import com.momo.entities.Utente;

public interface UtenteService {

	Utente addUtente(Utente u);
	
	List<Utente> getUtenti();
	
	public void deleteUtente(int id);
	
	//Optional<Utente> getUtenteByEmailAndPw(String email, String password);
	
}
