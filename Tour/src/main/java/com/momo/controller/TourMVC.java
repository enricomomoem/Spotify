package com.momo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.momo.entities.Tour;
import com.momo.service.TourService;

@Controller
public class TourMVC {
	
	@Autowired
	TourService tourService;
	
	@GetMapping("paginaIniziale")
	public String pagIn() {
		tourService.listaTour();
		return "pagIniziale";
	}
	
	@PostMapping("paginaIniziale")
	public String pagInC() {
		return "pagIniziale";
	}
	
	@GetMapping("lista")
	public String getListaTour() {
		tourService.listaTour();
		return "lista";
	}
	
	@PostMapping("lista")
	public String getListaTourC() {
		return "lista";
	}
	
	@GetMapping("homePageUser")
	public String homePageU() {
		tourService.listaTour();
		return "homePageUser";
	}
	
	@PostMapping("homePageUser")
	public String homePageUser() {
		
		return "homePageUser";
	}
	
	@GetMapping("aggiungiTour")
	public String addTour(Tour t) {
		return "aggiungiTour";
	}
	
	
	@PostMapping("aggiungiTour")
	public String addTourDB(Tour t) {
		 tourService.addTour(t);
		 return"aggiungiTour";
	}
	
	@GetMapping("homePageAdd")
	public String homePageADD(Tour t) {
		return "homePageAdd";
	}
	
	
	@PostMapping("homePageAdd")
	public String homePage(Tour t) {
		 tourService.addTour(t);
		 return"homePageAdd";
	}
	
	
	
	

}
