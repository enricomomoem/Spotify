package com.momo.service;

import java.util.List;

import com.momo.entities.Brano;

public interface BranoService {
	
	List<Brano> getListaBrani();
	
	
	
	Brano addBrano(Brano b);
	
	void deleteBrano(Brano b);

}
