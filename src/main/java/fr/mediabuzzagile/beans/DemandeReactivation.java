package main.java.fr.mediabuzzagile.beans;

import java.util.Date;

/**
 * 
 */
public class DemandeReactivation {

	/**
	 * Default constructor
	 */
	public DemandeReactivation() {
	}

	/**
	 * 
	 */
	private Date dateDemande;

	/**
	 * 
	 */
	private String texte;

	public Date getDateDemande() {
		return dateDemande;
	}

	public void setDateDemande(Date dateDemande) {
		this.dateDemande = dateDemande;
	}

	public String getTexte() {
		return texte;
	}

	public void setTexte(String texte) {
		this.texte = texte;
	}

}