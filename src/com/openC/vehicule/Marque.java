package com.openC.vehicule;

/**
 * <b> Marquer est un enum qui permet de stocker les diff�rentes Marques.</b>
 * <p>
 * Une Marque est caract�ris�e par les informations suivantes :
 * <ul>
 * <li>Un nom.</li>
* </ul>
 * </p>
 * @author Lorraine
 * @version 1.0
 */

public enum Marque {

	RENO("Je suis une RENO"),
	PIGEO("Je suis une PIGEO"),
	TROEN("Je suis une TROEN");
	private String nom = "";

	private Marque(String nom) {
		this.nom = nom;
	}

	public String toString() {
		return nom;
	}

}
