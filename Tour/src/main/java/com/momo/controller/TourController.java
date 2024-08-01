package com.momo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.momo.entities.Tour;
import com.momo.service.TourService;

@RestController
@RequestMapping("api")
public class TourController {
	
	@Autowired
	TourService tourService;

	@GetMapping("listaTour")
	public List<Tour> getListaTour(){
		return tourService.listaTour();
	}
	
	@PostMapping("aggiungiTour")
	public Tour addTourDB(@RequestBody Tour t) {
		return tourService.addTour(t);
	}
	
	

}
