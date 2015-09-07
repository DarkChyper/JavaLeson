/**
 * 
 */
package fr.class_vehicules;

import fr.constantes.garage.Marque;

/**
 * Classe héritant de Véhicule et créant une Véhicule Lagouna C
 * 
 * @author dark
 * 
 */
public class Lagouna extends Vehicule {
	/* (non-Javadoc)
	 * @see fr.class_vehicules.Vehicule#getNom()
	 */
	@Override
	public String getNom(){
		return "Lagouna";
	}

	/* (non-Javadoc)
	 * @see fr.class_vehicules.Vehicule#getNomMarque()
	 */
	@Override
	public Marque getNomMarque(){
		return Marque.RENO;
	}
}
