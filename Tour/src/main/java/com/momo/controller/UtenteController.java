package com.momo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.momo.entities.Tour;
import com.momo.entities.Utente;
import com.momo.service.UtenteService;

@RestController
@RequestMapping("api")
public class UtenteController {
	
	
	@Autowired
	UtenteService utenteService;
	
	@GetMapping("listaUtente")
	public List<Utente> getListaUtente(){
		return utenteService.listaUtenti();
	}
	
	@PostMapping("aggiungiUtente")
	public Utente addUtenteDB(@RequestBody Utente u) {
		return utenteService.addUtente(u);
	}

}
