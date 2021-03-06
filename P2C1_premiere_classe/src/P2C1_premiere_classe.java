import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P2C1_premiere_classe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Ville ville1 = new Ville("Lyon", 654, "France");
		Ville ville2 = new Ville("Lille", 123, "France");
		Ville ville3 = new Ville("Arras", 123, "France");

		List<Ville> listeVille = new ArrayList<Ville>();

		listeVille.add(ville1);
		listeVille.add(ville2);
		listeVille.add(ville3);

		for (Ville ville : listeVille) {
			System.out.println(ville.getNomVille());
		}

		Collections.sort(listeVille);

		System.out.println("Triage");

		for (Ville ville : listeVille) {
			System.out.println(ville.getNomVille());
		}
		
		System.out.println(ville2.compareTo(ville1));
		
		Ville c = new VilleCompliquer();
		System.out.println(c.test());

	}

}
