package com.momo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.momo.entities.Tour;
import com.momo.entities.Utente;
import com.momo.service.UtenteService;

@Controller
public class UtenteMVC {
	
	@Autowired
	UtenteService utenteService;
	
	@GetMapping("aggiungiUtente")
	public String addUtente(Utente u) {
		return "registrazione";
	}
	
	
	@PostMapping("aggiungiUtente")
	public String addutenteDB(Utente u) {
		 utenteService.addUtente(u);
		 return"homePageUser";
	}

}
