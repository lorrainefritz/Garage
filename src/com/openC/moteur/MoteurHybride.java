package com.openC.moteur;

public class MoteurHybride extends Moteur {

	public MoteurHybride(String cylindre, double prix) {
		super(cylindre, prix);
		// TODO Auto-generated constructor stub
		this.setType(TypeMoteur.HYBRIDE);
	}

	

}
