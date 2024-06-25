package com.momo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.momo.entities.Brano;

public interface BranoDAO extends JpaRepository<Brano, Integer> {
	
	@Query(value = "select * from brani",nativeQuery = true)
	List<Brano> findAll();

}
