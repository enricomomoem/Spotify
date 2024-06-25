package com.momo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.momo.entities.PlayList;
import com.momo.service.PlayListService;

@RestController
@RequestMapping("api")
public class PlayListRest {
	
	@Autowired
	PlayListService servicePlayList;
	
	@GetMapping("homePageUser/playLista")
	 public List<PlayList> getAllPlayList(){
		return servicePlayList.getAllPlayList();	 
	 };
	 
	 @PostMapping("homePageUser/playLista")
	public PlayList addUnaPlayList(@RequestBody PlayList p) {
		 return servicePlayList.addPlayList(p);
	 }
	 
	 @DeleteMapping("homePageUser/playLista")
	 public void deleteUnaPlayList(@RequestBody PlayList p) {
		 servicePlayList.deletePlayList(p);
	 }
	 
	
	

}
