/**
 * 
 */
public package fr.constantes.garage;

/**
 * Enumeration regroupant les marques de voiture disponibles
 * 
 * @author dark
 * 
 */
public enum Marque {
	RENO("RENO"), PIGEOT("PIGEOT"), TROEN("TROEN");

	private String marque;

	/**
	 * Constructeur
	 * 
	 * @param marque
	 */
	private Marque(final String marque) {
		this.marque = marque;
	}

	/**
	 * @return the marque
	 */
	public String getMarque() {
		return marque;
	}
}