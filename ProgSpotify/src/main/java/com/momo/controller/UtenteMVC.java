package com.momo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.momo.entities.Utente;
import com.momo.service.UtenteService;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UtenteMVC {
	
	@Autowired
	private UtenteService serviceUtente;
	
	
	@GetMapping("logInUtenti")
	public String LogIn() {
		return "LogIn1";
	}
	
	@PostMapping("logInUtenti")
	public String LogIn1() {
		return "redirect:homePageUser";
	}
	
	
	
	@GetMapping("registraUtenti")
	public String addUtente(Utente u) {
		//serviceUtente.addUtente(u);
		return "LogIn";
	}
	
	@PostMapping("registraUtenti")
	public String addUtentiDB(Utente u) {
		serviceUtente.addUtente(u);
		return "redirect:homePageUser";
	}
	

	
	
	

}
