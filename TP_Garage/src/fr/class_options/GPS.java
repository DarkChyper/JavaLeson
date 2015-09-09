/**
 * 
 */
package fr.class_options;

import java.io.Serializable;

/**
 * @author dark
 * 
 */
public class GPS implements Option, Serializable {

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
		return 113.5;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GPS (" + getPrix() + "€)";
	}

}
