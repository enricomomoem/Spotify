package com.momo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.momo.entities.Tour;
import com.momo.repos.TourDAO;

@Service
public class TourServiceImpl implements TourService {
	
	@Autowired
	TourDAO tourDAO;

	@Override
	public Tour addTour(Tour t) {
		return tourDAO.save(t);
	}

	@Override
	public List<Tour> listaTour() {
		return tourDAO.findAll();	}

}
