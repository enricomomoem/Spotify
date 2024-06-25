package com.momo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.momo.entities.PlayList;
import com.momo.repo.PlayListDAO;

@Service
public class PlayListServiceImpl implements PlayListService {

	@Autowired
	PlayListDAO dao;
	
	@Override
	public List<PlayList> getAllPlayList() {
		return dao.findAll();
	}

	@Override
	public PlayList getPlayList(PlayList p) {
		return null;
	}

	@Override
	public PlayList addPlayList(PlayList p) {
		return dao.save(p);
	}

	@Override
	public void deletePlayList(PlayList p) {
		dao.delete(p);
	}

}
