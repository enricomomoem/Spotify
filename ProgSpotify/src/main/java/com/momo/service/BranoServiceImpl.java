package com.momo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.momo.entities.Brano;
import com.momo.repo.BranoDAO;

@Service
public class BranoServiceImpl implements BranoService {

	@Autowired
	BranoDAO daoBrano;

	@Override
	public List<Brano> getListaBrani() {
		return daoBrano.findAll();
	}

	@Override
	public Brano addBrano(Brano b) {
		return daoBrano.save(b);
	}

	@Override
	public void deleteBrano(Brano b) {
		daoBrano.delete(b);
		
	}

}
