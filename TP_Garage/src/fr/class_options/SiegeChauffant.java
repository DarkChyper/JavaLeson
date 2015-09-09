/**
 * 
 */
package fr.class_options;

import java.io.Serializable;

/**
 * @author dark
 * 
 */
public class SiegeChauffant implements Option, Serializable {

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
		return 562.9;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Siege Chauffant (" + getPrix() + "€)";
	}
}
