/**
 * 
 */
package fr.class_vehicules;

import java.io.Serializable;

import fr.constantes.garage.Marque;

/**
 * Classe héritant de Véhicule et créant une Véhicule Lagouna C
 * 
 * @author dark
 * 
 */
public class Lagouna extends Vehicule implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
