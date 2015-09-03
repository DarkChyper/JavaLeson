/**
 * 
 */
package fr.class_typemoteur;

import fr.constantes.garage.TypeMoteur;

/**
 * @author dark
 * 
 */
public class MoteurHybride extends Moteur {

	/**
	 * @param cylindre
	 * @param prix
	 */
	public MoteurHybride(final String cylindre, final Double prix) {
		super(cylindre, prix);
		this.type = TypeMoteur.HYBRIDE;
	}

}
