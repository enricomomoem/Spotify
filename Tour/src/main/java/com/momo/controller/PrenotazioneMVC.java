package com.momo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.momo.entities.Prenotazione;
import com.momo.entities.Tour;
import com.momo.service.PrenotazioneService;

@Controller
public class PrenotazioneMVC {
	
	@Autowired
	PrenotazioneService prenService;
	
	@GetMapping("prenotazioneTours")
	public String getListaPren() {
		prenService.listaPrenotazioni();
		return "prenotazioneTours";
	}
	
	@PostMapping("prenotazioneTours")
	public String getListaPrenC() {
		return "prenotazioneTours";
	}
	
	@GetMapping("aggiungiPrenotazione")
	public String addPrenotazione(Prenotazione p) {
		return "prenotazioneTours";
	}
	
	
	@PostMapping("aggiungiPrenotazione")
	public String addPrenotazioneDB(Prenotazione p) {
		 prenService.addPrenotazione(p);
		 return"prenotazioneTours";
	}

}
