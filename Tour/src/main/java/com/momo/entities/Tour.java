package com.momo.entities;

import java.util.List;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tours")
public class Tour {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long tour_id;
	private String nome;
	private String tipologia;
	private int posti_totali;
	private boolean disponibilita=true;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tour", cascade = CascadeType.ALL)
	private List<Prenotazione> prenotazioni;
	
	
	
	
	public List<Prenotazione> getPrenotazioni() {
		return prenotazioni;
	}
	public void setPrenotazioni(List<Prenotazione> prenotazioni) {
		this.prenotazioni = prenotazioni;
	}
	

	public long getTour_id() {
		return tour_id;
	}
	public void setTour_id(long tour_id) {
		this.tour_id = tour_id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipologia() {
		return tipologia;
	}
	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}
	
	public int getPosti_totali() {
		return posti_totali;
	}
	public void setPosti_totali(int posti_totali) {
		this.posti_totali = posti_totali;
	}
	public boolean isDisponibilita() {
		return disponibilita;
	}
	public void setDisponibilita(boolean disponibilita) {
		this.disponibilita = disponibilita;
	}

	
	
	
	


}
