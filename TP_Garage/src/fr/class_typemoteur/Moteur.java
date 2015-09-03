/**
 * 
 */
package fr.class_typemoteur;

import fr.constantes.garage.TypeMoteur;

/**
 * @author dark
 * 
 */
public class Moteur {

	protected TypeMoteur type;
	private String cylindre;
	private Double prix;

	public Moteur(final String cylindre, final Double prix) {
		this.cylindre = cylindre;
		this.prix = prix;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final String str = new String("Moteur " + this.type + " "
				+ this.cylindre + " (" + this.prix);
		return str;
	}

	/**
	 * @return the cylindre
	 */
	public String getCylindre() {
		return cylindre;
	}

	/**
	 * @param cylindre
	 *            the cylindre to set
	 */
	public void setCylindre(final String cylindre) {
		this.cylindre = cylindre;
	}

	/**
	 * @return the prix
	 */
	public Double getPrix() {
		return prix;
	}

	/**
	 * @param prix
	 *            the prix to set
	 */
	public void setPrix(final Double prix) {
		this.prix = prix;
	}

}
