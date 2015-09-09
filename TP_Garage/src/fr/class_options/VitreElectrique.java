/**
 * 
 */
package fr.class_options;

import java.io.Serializable;

/**
 * @author dark
 * 
 */
public class VitreElectrique implements Option, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.class_options.Option#getPrix()
	 */
	@Override
	public Double getPrix() {
		return 212.3;
	}

	@Override
	public String toString() {
		return "Vitre electrique (" + getPrix() + "€)";
	}
}
