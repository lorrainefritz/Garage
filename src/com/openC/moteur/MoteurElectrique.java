package com.openC.moteur;

public class MoteurElectrique extends Moteur {

	
	public MoteurElectrique(String cylindre, double prix) {
		super(cylindre, prix);
		// TODO Auto-generated constructor stub
		this.setType(TypeMoteur.ELECTRIQUE);
	}


	
	
}
