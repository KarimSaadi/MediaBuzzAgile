package main.java.fr.mediabuzzagile.beans;

import main.java.fr.mediabuzzagile.lib.Publication;

/**
 * 
 */
public class Commentaire implements Publication {

	/**
	 * Default constructor
	 */
	public Commentaire() {
	}

	/**
	 * 
	 */
	private String texte;

	/**
	 * 
	 */
	@Override
	public void publier() {

	}

	/**
	 * 
	 */
	@Override
	public void supprimer() {

	}

	/**
	 * Chelou
	 */

	@Override
	public void activer() {

	}

	@Override
	public void desactiver() {

	}

	public String getTexte() {
		return texte;
	}

	public void setTexte(String texte) {
		this.texte = texte;
	}

}