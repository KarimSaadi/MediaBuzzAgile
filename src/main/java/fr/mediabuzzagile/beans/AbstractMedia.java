package main.java.fr.mediabuzzagile.beans;

import java.util.*;

import main.java.fr.mediabuzzagile.lib.Media;

/**
 * 
 */
public abstract class AbstractMedia implements Media {

	/**
	 * 
	 */
	protected String titre;

	/**
	 * 
	 */
	protected String description;

	/**
	 * 
	 */
	protected Date datePublication;

	/**
	 * 
	 */
	protected byte fichier;

	/**
	 * 
	 */
	@Override
	public void modifier() {

	};

	@Override
	public void publier() {

	}

	@Override
	public void supprimer() {

	}

	@Override
	public void activer() {

	}

	@Override
	public void desactiver() {

	}

}