
public class sdz1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// My first programm
		System.out.print("Hello world");
		System.out.println("\nMy name is");
		System.out.print("\nDarkChyper");
		
		byte temperature;
		temperature = 64; // byte peut contenenir -128<x<127 sur 1 octet
		
		short vitesseMax;
		vitesseMax = 32000; // short sur 2 octet permet -32768 < x < 32767
		
		int temperatureSoleil;
		temperatureSoleil = 15600000; // int sur 4 octetss -2*109 < x < 2*109
		
		long anneeLumiere;
		anneeLumiere = 946070000000000L; // long nécessite un L à la fin, sur 8 octets
		
		float pi;
		pi = 3.141592653f;
		float nombre;
		nombre = 2.0f;
		
		double division;
		division = 0.333333333333333333333333333333333334d;
		
		char caractere;
		caractere = 'A';
		
		boolean question;
		question = true;
		
		//Premiere methode de déclaration
		String phrase;
		phrase = "Titi et grosminet";
		
		//Deuxieme méthode de déclaration
		String str = new String();
		str = "Une autre chaine de cractéres";
		
		//Troisieme méthode de déclaration
		String string = "une autre chaine";
		
		//Quatrieme méthode de déclaration
		String chaine = new String("Et une de plus");
		
		double nbre1 = 10, nbre2 = 3;
		int resultat = (int)(nbre1 / nbre2);
		System.out.print("Le résultat est = "  + resultat);
		
		

	}

}