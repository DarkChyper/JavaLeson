
public class Voiture {
	
	protected String nom;
	public static int nbreInstances = 0;
	
	public Voiture() {
		nbreInstances++;
		nom = "Voiture " + Integer.toString(getNbreInstances());
	}

	public static int getNbreInstances() {
		return nbreInstances;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return nom;
	}
	
	
}
