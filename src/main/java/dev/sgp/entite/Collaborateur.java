package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;

public class Collaborateur {

	private String matricule;
	private String nom;
	private String prenom;
	private LocalDate dateDeNaissance;
	private String Adresse;
	private String numeroDeSecuriteSociale;
	private String photo;
	private String emailPro;
	private ZonedDateTime dateHeurereation;
	private boolean actif;

	public Collaborateur() {

	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public String getNumeroDeSecuriteSociale() {
		return numeroDeSecuriteSociale;
	}

	public void setNumeroDeSecuriteSociale(String numeroDeSecuriteSociale) {
		if (numeroDeSecuriteSociale.length() == 15) {
			this.numeroDeSecuriteSociale = numeroDeSecuriteSociale;
		}
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getEmailPro() {
		return emailPro;
	}

	public void setEmailPro(String emailPro) {
		this.emailPro = emailPro;
	}

	public ZonedDateTime getDateHeurereation() {
		return dateHeurereation;
	}

	public void setDateHeurereation(ZonedDateTime dateHeurereation) {
		this.dateHeurereation = dateHeurereation;
	}

	public boolean isActif() {
		return actif;
	}

	public void setActif(boolean actif) {
		this.actif = actif;
	}
}
