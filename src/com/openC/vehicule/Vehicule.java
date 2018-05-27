package com.openC.vehicule;

import java.util.ArrayList;

import com.openC.moteur.Moteur;
import com.openC.options.Option;

/**
 * <b> Vehicule est une classe qui permet l'assemblage d'un véhicule.</b>
 * <p>
 * Un véhicule est caractérisé par les informations suivantes :
 * <ul>
 * <li>Un prix.</li>
 * <li>Un nom.</li>
 * <li>Une Marque.</li>
 * <li>Un Moteur.</li>
 * <li>Une Liste d'options.</li>
 * </ul>
 * </p>
 * 
 * 
 * 
 * @author Lorraine
 * @version 1.0
 */

public class Vehicule {

	private double prix;
	private String nom;
	private Marque nomMarque;
	private Moteur moteur;
	public ArrayList<Option> options = new ArrayList<>();

	/**
	 * Constructeur Vehicule.
	 * <p>
	 * Détails éventuels à rajouter sur la construction
	 * </p>
	 * 
	 *
	 * 
	 */

	public Vehicule() {
		System.out.println("J'instancie un vehicule");
	}

	/**
	 * Retourne le prix du Vehicule.
	 * 
	 * @return Le prix, sous forme d'un réel.
	 */

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Marque getNomMarque() {
		return nomMarque;
	}

	public void setNomMarque(Marque nomMarque) {
		this.nomMarque = nomMarque;
	}

	public Moteur getMoteur() {
		return moteur;
	}

	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}

	public ArrayList<Option> getOptions() {
		return options;
	}

	public void setOptions(ArrayList<Option> options) {
		this.options = options;
	}

}
