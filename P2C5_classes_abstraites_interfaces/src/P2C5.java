public class P2C5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Les méthodes d'un chien
		Chien c = new Chien("Gris bleuté", 20);
		c.boire();
		c.manger();
		c.deplacement();
		c.crier();
		System.out.println(c.toString());

		System.out.println("--------------------------------------------");
		// Les méthodes de l'interface
		c.faireCalin();
		c.faireLeBeau();
		c.faireLechouille();

		System.out.println("--------------------------------------------");
		// Utilisons le polymorphisme de notre interface
		Rintintin r = new Chien();
		r.faireLeBeau();
		r.faireCalin();
		r.faireLechouille();

	}

}
