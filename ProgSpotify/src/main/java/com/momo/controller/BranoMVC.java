package com.momo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.momo.entities.Brano;
import com.momo.service.BranoService;

@Controller
public class BranoMVC {
	
	@Autowired
	BranoService serviceBrano;
	
	@GetMapping("homePageUser")
	public String getListaBrano(){
		serviceBrano.getListaBrani();
		return "homePageUser";
	}
	
	@PostMapping("homePageUser/brano")
	public Brano addBrano(Brano b) {
		return serviceBrano.addBrano(b);
	}

}
