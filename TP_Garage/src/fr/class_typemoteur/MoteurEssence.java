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
public class MoteurEssence extends Moteur implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param cylindre
	 * @param prix
	 */
	public MoteurEssence(final String cylindre, final Double prix) {
		super(cylindre, prix);
		this.type = TypeMoteur.ESSENCE;
	}

}
