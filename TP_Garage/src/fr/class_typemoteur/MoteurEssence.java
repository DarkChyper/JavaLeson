/**
 * 
 */
package fr.class_typemoteur;

import fr.constantes.garage.TypeMoteur;

/**
 * @author dark
 * 
 */
public class MoteurEssence extends Moteur {

	/**
	 * @param cylindre
	 * @param prix
	 */
	public MoteurEssence(final String cylindre, final Double prix) {
		super(cylindre, prix);
		this.type = TypeMoteur.ESSENCE;
	}

}
