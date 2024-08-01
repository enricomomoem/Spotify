package com.momo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.momo.entities.Utente;

public interface UtenteDAO extends JpaRepository<Utente, Long> {

}
