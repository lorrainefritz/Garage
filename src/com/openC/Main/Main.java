package com.openC.Main;

import com.openC.garage.Garage;
import com.openC.moteur.MoteurEssence;
import com.openC.vehicule.Lagouna;
import com.openC.vehicule.Vehicule;

public class Main {

	public static void main(String[] args) {
		Garage garage = new Garage();
		System.out.println(garage);

		Vehicule lag1 = new Lagouna();
		lag1.setMoteur(new MoteurEssence("150 Chevaux", 10256d));
//		lag1.addOption(new GPS());
//		lag1.addOption(new SiegeChauffant());
//		lag1.addOption(new VitreElectrique());
//		garage.addVoiture(lag1);

	}

}
