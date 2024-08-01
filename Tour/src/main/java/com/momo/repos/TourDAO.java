package com.momo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.momo.entities.Tour;

public interface TourDAO extends JpaRepository<Tour, Long> {

}
