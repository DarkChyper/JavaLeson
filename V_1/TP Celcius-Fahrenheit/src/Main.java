
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * petit programme qui demande à l'utilisateur dans quelle sens il veut faire la conversion
		 * Farhenheit<=>Celcius
		 * demande la valeur et donne la conversion.
		 * Demande si on veut recommencer ou quitte.
		 */
		
		//Definition des variables 
		char choix = ' ', mode = ' ';
		double tempIn = 0, tempOut = 0, resultat;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("SYSTEME DE CONVERTION FARHENHEIT-CELCIUS");
		System.out.println("----------------------------------------");
		
		//initialisation de la variable de sortie à faux
		boolean fin = false;
		
		//boucle pour effectuer plusieures conversion à la suite tant que l'utilisateur ne demande de quitter
		while(fin == false)
				{
				 do
				 {
					 // on boucle tant que l'utilisateur n'a pas tapé 1 ou 2
					 System.out.println("Choisissez le mode de conversion:");
					 System.out.println("1 - Convertisseur Celcius en Fahrenheit");
					 System.out.println("2 - Convertisseur Fahreinheit en Celcius");
					 mode = sc.nextLine().charAt(0);
				 }while(mode !='1' && mode !='2');
				 
				 //On demande à l'utilisateur quelle temperature il veut convertir
				 System.out.println("Température à convertir :");
				 tempIn = sc.nextDouble();
				 sc.nextLine();
				 
				 if(mode == '1') // converion C => F
				 	{
					 tempOut = ((9 * tempIn) / 5) + 32;
					 resultat = arrondi(tempOut, 2);
					 System.out.println(tempIn + " °C équivaut à " + resultat + " °F");
				 	}
				 else if(mode == '2')
				 	{
					 tempOut = ((tempIn-32) * 5 ) / 9;
					 resultat = arrondi(tempOut, 2);
					 System.out.println(tempIn + " °F équivaut à " + resultat + " °C");
				 	}
				 do // on demande si l'utilisteur veut sortir ou non
				 	{
					 System.out.println("Souhaitez vous convertir une autre température ? O/N");
					 choix = sc.nextLine().charAt(0);
					 
					 
				 	}while(choix != 'O' && choix != 'o' && choix != 'n' && choix != 'N');
				 
				 if(choix == 'O' || choix == 'o')
				 	fin = true;
				 	
		//Fin de la boucle du convertisseur, on sort du programme
		System.out.println("Au revoir !");
		
				}
	}
	public static double arrondi(double A, int B) {
		  return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
		}
		

	}


