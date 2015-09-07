/**
 * 
 */
package fr.class_vehicules;

/**
 * Classe héritant de Véhicule et créant une Véhicule Lagouna C
 * 
 * @author dark
 * 
 */
public class Lagouna extends Vehicule {

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.class_vehicules.Vehicule#toString()
	 */
	@Override
	public String toString() {
		final String str = super.toString() + "lagouna";
		return str;
	}
}
