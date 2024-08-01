package com.momo.service;

import java.util.List;

import com.momo.entities.Prenotazione;


public interface PrenotazioneService {
	
	Prenotazione addPrenotazione(Prenotazione p);
	
	List<Prenotazione> listaPrenotazioni();

}
