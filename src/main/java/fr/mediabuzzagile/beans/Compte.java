package main.java.fr.mediabuzzagile.beans;

import main.java.fr.mediabuzzagile.lib.Moderable;

/**
 * 
 */
public class Compte implements Moderable {

	/**
	 * Default constructor
	 */
	public Compte() {
	}

	/**
	 * 
	 */
	private String login;

	/**
	 * 
	 */
	private String password;

	/**
	 * 
	 */
	@Override
	public void activer() {

	}

	/**
	 * 
	 */
	@Override
	public void desactiver() {

	}

	/**
	 * 
	 */
	public void supprimer() {

	}

	/**
	 * 
	 */
	public void reinitialiserPassword() {

	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}