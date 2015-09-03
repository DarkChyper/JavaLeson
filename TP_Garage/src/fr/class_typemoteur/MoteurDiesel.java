/**
 * 
 */
package fr.class_typemoteur;

import fr.constantes.garage.TypeMoteur;

/**
 * @author dark
 * 
 */
public class MoteurDiesel extends Moteur {

	/**
	 * @param cylindre
	 * @param prix
	 */
	public MoteurDiesel(final String cylindre, final Double prix) {
		super(cylindre, prix);
		this.type = TypeMoteur.DIESEL;
	}

}
