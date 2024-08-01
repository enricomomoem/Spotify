package com.momo.service;

import java.util.List;

import com.momo.entities.Utente;

public interface UtenteService {
	
	Utente addUtente(Utente u);
	
	List<Utente> listaUtenti();

}
