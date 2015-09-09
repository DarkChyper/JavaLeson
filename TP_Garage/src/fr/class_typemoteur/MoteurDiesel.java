/**
 * 
 */
package fr.class_typemoteur;

import java.io.Serializable;

import fr.constantes.garage.TypeMoteur;

/**
 * @author dark
 * 
 */
public class MoteurDiesel extends Moteur implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param cylindre
	 * @param prix
	 */
	public MoteurDiesel(final String cylindre, final Double prix) {
		super(cylindre, prix);
		this.type = TypeMoteur.DIESEL;
	}

}
