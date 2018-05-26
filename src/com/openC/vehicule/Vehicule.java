package com.openC.vehicule;

import java.util.ArrayList;

import com.openC.moteur.Moteur;
import com.openC.options.Option;

public class Vehicule {

	private double prix;
	private String nom;
	private Marque nomMarque;
	private Moteur moteur;
	public ArrayList<Option> options = new ArrayList<>();

}
