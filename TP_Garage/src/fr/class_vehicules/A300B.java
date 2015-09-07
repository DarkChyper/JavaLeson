/**
 * 
 */
package fr.class_vehicules;

import fr.constantes.garage.Marque;

/**
 * Classe héritant de Véhicule et créant une Véhivule Lagouna C
 * 
 * @author dark
 * 
 */
public class A300B extends Vehicule {
	/* (non-Javadoc)
	 * @see fr.class_vehicules.Vehicule#getNom()
	 */
	@Override
	public String getNom(){
		return "A300B";
	}
	/* (non-Javadoc)
	 * @see fr.class_vehicules.Vehicule#getNomMarque()
	 */
	@Override
	public Marque getNomMarque(){
		return Marque.TROEN;
	}
}
