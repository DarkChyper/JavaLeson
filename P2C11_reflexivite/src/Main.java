import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		final Class c = new String().getClass();
		final Method[] m = c.getMethods();

		System.out
				.println("Il y a " + m.length + " méthodes dans cette classe");
		// On parcourt le tableau de méthodes
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i]);
		}

		final Constructor[] construc = c.getConstructors();
		System.out.println("Il y a " + construc.length
				+ " constructeurs dans cette classe");
		// On parcourt le tableau des constructeurs
		for (int i = 0; i < construc.length; i++) {
			System.out.println(construc[i].getName());

			final Class[] param = construc[i].getParameterTypes();
			for (int j = 0; j < param.length; j++) {
				System.out.println(param[j]);
			}

			System.out.println("-----------------------------\n");
		}
	}

}
