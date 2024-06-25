package com.momo.service;

import java.util.List;

import com.momo.entities.Brano;
import com.momo.entities.PlayList;

public interface PlayListService {
	
	List<PlayList> getAllPlayList();
	
	//List<Brano> getPlayListBrani();
	
	PlayList getPlayList(PlayList p);
	
	PlayList addPlayList(PlayList p);
	
	void deletePlayList(PlayList p);

}
