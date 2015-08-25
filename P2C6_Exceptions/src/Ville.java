public class Ville implements Comparable<Ville> {
	protected static final String TEST = "Test";
	// Stocke le nom de notre ville
	protected String nomVille;
	// Stocke le nom du pays de notre ville
	protected String nomPays;
	// Stocke le nombre d'habitants de notre ville
	protected int nbreHabitants;

	// Catégorie de la ville en fonction du nombre d'habitants
	protected char categorie;
	
	// Variable publique qui compte les instances
	public static int nbreInstances = 0;
	
	// Variable privée qui comptera aussi les instances
	protected static int nbreInstancesBis = 0;

	// ****** CONSTRUCTEURS ******


	/**
	 * 
	 */
	public Ville() {
		System.out.println("Création d'une ville !");
		nbreInstances++;
	    nbreInstancesBis++; 
		nomVille = "Inconnu";
		nomPays = "Inconnu";
		nbreHabitants = 0;

	}


	/**
	 * @return the nbreInstances
	 */
	public static int getNbreInstances() {
		return nbreInstances;
	}


	/**
	 * @param nbreInstances the nbreInstances to set
	 */
	public static void setNbreInstances(int nbreInstances) {
		Ville.nbreInstances = nbreInstances;
	}


	/**
	 * @return the nbreInstancesBis
	 */
	public static int getNbreInstancesBis() {
		return nbreInstancesBis;
	}


	/**
	 * @param nbreInstancesBis the nbreInstancesBis to set
	 */
	public static void setNbreInstancesBis(int nbreInstancesBis) {
		Ville.nbreInstancesBis = nbreInstancesBis;
	}


	/**
	 * @param pNom
	 * @param pNbre
	 * @param pPays
	 */
	public Ville(String pNom, int pNbre, String pPays) {
		System.out.println("Création d'une ville avec des paramètres !");
		nbreInstances++;
	    nbreInstancesBis++; 
		nomVille = pNom;
		nomPays = pPays;
		nbreHabitants = pNbre;
		System.out.println(TEST);
		System.out.println(TEST);

	}

	/**
	 * @return the nomVille
	 */
	public String getNomVille() {
		return nomVille;
	}

	/**
	 * @param nomVille the nomVille to set
	 */
	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}

	/**
	 * @return the nomPays
	 */
	public String getNomPays() {
		return nomPays;
	}

	/**
	 * @param nomPays the nomPays to set
	 */
	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}

	/**
	 * @return the nbreHabitants
	 */
	public int getNbreHabitants() {
		return nbreHabitants;
	}

	/**
	 * @param nbreHabitants the nbreHabitants to set
	 */
	public void setNbreHabitants(int nbreHabitants) {
		this.nbreHabitants = nbreHabitants;
	}

	/**
	 * @return the categorie
	 */
	public char getCategorie() {
		return categorie;
	}

	/**
	 * @param categorie the categorie to set
	 */
	public void setCategorie(char categorie) {
		this.categorie = categorie;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Ville o) {
		return this.nomVille.compareTo(o.nomVille);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String phrase = new String(this.nomVille + " est une ville de " + this.nomPays + ", elle comporte " + this.nbreHabitants + " habitant(s) => elle est donc de catégorie " + this.categorie + ".");
		return phrase;
	}
	
	/**
	 * LOL test
	 * @return
	 */
	public String test(){
		return "test";
	}

}
