/**
 * 
 */
package fr.class_options;

/**
 * @author dark
 * 
 */
public class VitreElectrique implements Option {

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
