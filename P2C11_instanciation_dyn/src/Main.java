import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		final String nom = Paire.class.getName();
		try {
			// On crée un objet Class
			final Class cl = Class.forName(nom);
			// Nouvelle instance de la classe Paire
			final Object o = cl.newInstance();

			// On crée les paramètres du constructeur
			final Class[] types = new Class[] { String.class, String.class };
			// On récupère le constructeur avec les deux paramètres
			final Constructor ct = cl.getConstructor(types);

			// On instancie l'objet avec le constructeur surchargé !
			final Object o2 = ct.newInstance(new String[] { "valeur 1 ",
					"valeur 2" });

			// On va chercher la méthode toString, elle n'a aucun paramètre
			final Method m = cl.getMethod("toString", null);
			// La méthode invoke exécute la méthode sur l'objet passé en
			// paramètre
			// Pas de paramètre, donc null en deuxième paramètre de la méthode
			// invoke !

			System.out.println("----------------------------------------");
			System.out.println("Méthode " + m.getName() + " sur o2: "
					+ m.invoke(o2, null));
			System.out.println("Méthode " + m.getName() + " sur o: "
					+ m.invoke(o, null));

		} catch (final SecurityException e) {
			e.printStackTrace();
		} catch (final IllegalArgumentException e) {
			e.printStackTrace();
		} catch (final ClassNotFoundException e) {
			e.printStackTrace();
		} catch (final InstantiationException e) {
			e.printStackTrace();
		} catch (final IllegalAccessException e) {
			e.printStackTrace();
		} catch (final NoSuchMethodException e) {
			e.printStackTrace();
		} catch (final InvocationTargetException e) {
			e.printStackTrace();
		}
	}

}
