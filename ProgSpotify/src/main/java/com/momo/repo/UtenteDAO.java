package com.momo.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.momo.entities.Utente;

public interface UtenteDAO extends JpaRepository<Utente, Integer> {
	
	@Query(value = "select username from utenti where username='username' and password='password'",nativeQuery = true)
	List<Utente> utentiRegistrati(String name, String password);
	
	//Utente getUtentebyEmailAndPw(String email, String password);

}
