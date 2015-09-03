/**
 * 
 */
package fr.class_typemoteur;

import fr.constantes.garage.TypeMoteur;

/**
 * @author dark
 * 
 */
public class MoteurElectrique extends Moteur {

	/**
	 * @param cylindre
	 * @param prix
	 */
	public MoteurElectrique(final String cylindre, final Double prix) {
		super(cylindre, prix);
		this.type = TypeMoteur.ELECTRIQUE;
	}

}
