
public class Ville {
	//stocke le nom de notre ville
	String nomVille;
	//stocke le nom du pays de notre ville
	String nomPays;
	//stocke le nombre d'habitants de notre ville
	int nbreHabitants;
	
	//constructeur par défaut
	public Ville(){
		System.out.println("Création d'une ville !");
		nomVille = "Inconnu";
		nomPays = "Inconnu";
		nbreHabitants = 0;
	}
	//Constructeur avec paramètres
	public Ville(String pNom, int pNbre, String pPays)
	{
		System.out.println("Création d'une ville avec des paramètres !");
		nomVille = pNom;
		nomPays = pPays;
		nbreHabitants = pNbre;
	}        

}
