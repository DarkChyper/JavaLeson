/**
 * 
 */
public package fr.constantes.garage;

/**
 * Enumerateur contenant les types de moteurs disponible dans le garage
 * 
 * @author dark
 * 
 */
public enum TypeMoteur {

	DIESEL("DIESEL"), ESSENCE("ESSENCE"), HYBRIDE("HYBRIDE"), ELECTRIQUE(
			"ELECTRIQUE");

	private final String typeMoteur;

	/**
	 * Constructeur
	 * 
	 * @param type
	 */
	private TypeMoteur(final String type) {
		this.typeMoteur = type;
	}

	/**
	 * @return the typeMoteur
	 */
	public String getTypeMoteur() {
		return typeMoteur;
	}
}
