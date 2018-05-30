package com.openC.moteur;

/**
 * <b> Moteur est une classe abstraite qui crée un moteur.</b>
 * <p>
 * Un moteur est caractérisé par les informations suivantes :
 * <ul>
 * <li>Un prix.</li>
 * <li>Un type.</li>
 * <li>Un nombre de cylindres.</li>
 * </ul>
 * </p>
 * @author Lorraine
 * @version 1.0
 */

public abstract class Moteur {

	private double prix;
	private TypeMoteur type;
	private String cylindre;
	
	
	public abstract void Moteur (String cylindre, double prix);


	public double getPrix() {
		return prix;
	}


	public void setPrix(double prix) {
		this.prix = prix;
	}


	public String getCylindre() {
		return cylindre;
	}


	public void setCylindre(String cylindre) {
		this.cylindre = cylindre;
	}
	
}
