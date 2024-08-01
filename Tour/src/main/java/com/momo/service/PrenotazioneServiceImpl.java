package com.momo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.momo.entities.Prenotazione;
import com.momo.repos.PrenotazioneDAO;

@Service
public class PrenotazioneServiceImpl implements PrenotazioneService {
	
	@Autowired
	PrenotazioneDAO prenDAO;

	@Override
	public Prenotazione addPrenotazione(Prenotazione p) {
		return prenDAO.save(p);
	}

	@Override
	public List<Prenotazione> listaPrenotazioni() {
		return prenDAO.findAll();
	}

}
