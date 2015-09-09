package fr.test;

import fr.class_options.BarreDeToit;
import fr.class_options.Climatisation;
import fr.class_options.GPS;
import fr.class_options.SiegeChauffant;
import fr.class_options.VitreElectrique;
import fr.class_typemoteur.MoteurDiesel;
import fr.class_typemoteur.MoteurElectrique;
import fr.class_typemoteur.MoteurEssence;
import fr.class_typemoteur.MoteurHybride;
import fr.class_vehicules.A300B;
import fr.class_vehicules.D4;
import fr.class_vehicules.Lagouna;
import fr.class_vehicules.Vehicule;
import fr.tp.garage.Garage;

public class Main {
	public static void main(final String[] args) {
		final Garage garage = new Garage("garage");
		System.out.println(garage);

		final Vehicule lag1 = new Lagouna();
		lag1.setMoteur(new MoteurEssence("150 Chevaux", 10256d));
		lag1.addOption(new GPS());
		lag1.addOption(new SiegeChauffant());
		lag1.addOption(new VitreElectrique());
		garage.addVoiture(lag1);

		final Vehicule A300B_2 = new A300B();
		A300B_2.setMoteur(new MoteurElectrique("1500 W", 1234d));
		A300B_2.addOption(new Climatisation());
		A300B_2.addOption(new BarreDeToit());
		A300B_2.addOption(new SiegeChauffant());
		garage.addVoiture(A300B_2);

		final Vehicule d4_1 = new D4();
		d4_1.setMoteur(new MoteurDiesel("200 Hdi", 25684.80d));
		d4_1.addOption(new BarreDeToit());
		d4_1.addOption(new Climatisation());
		d4_1.addOption(new GPS());
		garage.addVoiture(d4_1);

		final Vehicule lag2 = new Lagouna();
		lag2.setMoteur(new MoteurDiesel("500 Hdi", 456987d));
		garage.addVoiture(lag2);

		final Vehicule A300B_1 = new A300B();
		A300B_1.setMoteur(new MoteurHybride("ESSENCE/Electrique", 12345.95d));
		A300B_1.addOption(new VitreElectrique());
		A300B_1.addOption(new BarreDeToit());
		garage.addVoiture(A300B_1);

		final Vehicule d4_2 = new D4();
		d4_2.setMoteur(new MoteurElectrique("100 KW", 1224d));
		d4_2.addOption(new SiegeChauffant());
		d4_2.addOption(new BarreDeToit());
		d4_2.addOption(new Climatisation());
		d4_2.addOption(new GPS());
		d4_2.addOption(new VitreElectrique());
		garage.addVoiture(d4_2);

		System.out.println(garage.toString());
	}
}
