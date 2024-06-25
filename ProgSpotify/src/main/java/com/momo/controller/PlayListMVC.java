package com.momo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.momo.entities.PlayList;

import com.momo.service.PlayListService;

@Controller
public class PlayListMVC {
	
	@Autowired
	PlayListService servicePlayList;
	
	@GetMapping("homePageUser/playList")
	public String getListaPlayList(){
		servicePlayList.getAllPlayList();
		return "creaPlayList";
	}
	
	@PostMapping("homePageUser/playList")
	public String addPlayListDB(PlayList p) {
		servicePlayList.addPlayList(p);
		return "redirect:homePageUser";
	}
	
	@DeleteMapping("homePageUser/playList")
	public String deletePlayListDB(PlayList p) {
		servicePlayList.deletePlayList(p);
		return "homePageUser";
	}

	
	

}
