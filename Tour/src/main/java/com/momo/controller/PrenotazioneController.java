package com.momo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.momo.entities.Prenotazione;
import com.momo.entities.Tour;
import com.momo.service.PrenotazioneService;

@RestController
@RequestMapping("api")
public class PrenotazioneController {
	
	@Autowired
	PrenotazioneService prenService;
	
	@GetMapping("listaPrenotazioni")
	public List<Prenotazione> getListaTour(){
		return prenService.listaPrenotazioni();
	}
	
	@PostMapping("aggiungiPrenotazione")
	public Prenotazione addTourDB(@RequestBody Prenotazione p) {
		return prenService.addPrenotazione(p);
	}
	

}
