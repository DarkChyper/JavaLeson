public class Ville implements Comparable<Ville> {
	private static final String TEST = "Test";
	// Stocke le nom de notre ville
	private String nomVille;
	// Stocke le nom du pays de notre ville
	private String nomPays;
	// Stocke le nombre d'habitants de notre ville
	private int nbreHabitants;
	// Catégorie de la ville en fonction du nombre d'habitants
	private char categorie;

	// ****** CONSTRUCTEURS ******


	/**
	 * 
	 */
	public Ville() {
		System.out.println("Création d'une ville !");
		nomVille = "Inconnu";
		nomPays = "Inconnu";
		nbreHabitants = 0;

	}


	/**
	 * @param pNom
	 * @param pNbre
	 * @param pPays
	 */
	public Ville(String pNom, int pNbre, String pPays) {
		System.out.println("Création d'une ville avec des paramètres !");
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
	
	/**
	 * LOL test
	 * @return
	 */
	public String test(){
		return "test";
	}

}
