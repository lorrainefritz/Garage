package com.openC.moteur;

public class MoteurEssence extends Moteur {

	public  MoteurEssence (String cylindre, double prix) {
		// TODO Auto-generated method stub
		super(cylindre, prix);
		this.setType(TypeMoteur.ESSENCE);
		
	}



	
}
