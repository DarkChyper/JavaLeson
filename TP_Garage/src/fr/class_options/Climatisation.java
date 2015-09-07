/**
 * 
 */
package fr.class_options;

/**
 * @author dark
 * 
 */
public class Climatisation implements Option {

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.class_options.Option#getPrix()
	 */
	@Override
	public Double getPrix() {
		return 347.3;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Climatisation (" + getPrix() + "€)";
	}
}
