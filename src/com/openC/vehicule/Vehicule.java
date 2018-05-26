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

}
