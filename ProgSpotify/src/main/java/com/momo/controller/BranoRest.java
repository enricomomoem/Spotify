package com.momo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.momo.entities.Brano;
import com.momo.service.BranoService;

@RestController
@RequestMapping("api")
public class BranoRest {
	
	@Autowired
	BranoService serviceBrano;
	
	@GetMapping("homePageUser/brano")
	public List<Brano> getListaBrano(){
		return serviceBrano.getListaBrani();
	}
	
	@PostMapping("homePageUser/brano")
	public Brano addBrano(@RequestBody Brano b) {
		return serviceBrano.addBrano(b);
	}
	
	@DeleteMapping("homepage/deletebrano")
		public void deleteUnBrano(@RequestBody Brano b) {
			serviceBrano.deleteBrano(b);
		}
	

}
