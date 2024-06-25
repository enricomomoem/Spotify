package com.momo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.momo.entities.PlayList;

public interface PlayListDAO extends JpaRepository<PlayList, Integer> {

}
