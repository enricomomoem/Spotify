package com.momo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.momo.entities.Prenotazione;

public interface PrenotazioneDAO extends JpaRepository<Prenotazione, Long> {

}
