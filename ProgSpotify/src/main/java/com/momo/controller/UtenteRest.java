package com.momo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.momo.entities.Utente;
import com.momo.service.UtenteService;

@RestController
@RequestMapping("api")
public class UtenteRest {
	
	@Autowired
	UtenteService serviceUtente;
	
	@PostMapping("registraUtenti")
	public Utente addUtente(@RequestBody Utente u) {
		return serviceUtente.addUtente(u);
	}
	
	@GetMapping("mostraUtenti")
	public List<Utente> getListaUtenti(){
		return serviceUtente.getUtenti();
	}
	
	@DeleteMapping("eliminautente/{id}")
	public void delUtente(@PathVariable("id") int id) {
		serviceUtente.deleteUtente(id);
	}
	
	

}
