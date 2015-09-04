/**
 * 
 */
package fr.class_options;

/**
 * @author dark
 * 
 */
public class GPS implements Option {

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
		return "GPS";
	}

}
