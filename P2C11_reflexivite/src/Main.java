import java.lang.reflect.Method;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) { 
		  Class c = new String().getClass();
		  Method[] m = c.getMethods();
		                
		  System.out.println("Il y a " + m.length + " méthodes dans cette classe");
		  //On parcourt le tableau de méthodes
		  for(int i = 0; i < m.length; i++)
		    System.out.println(m[i]);
		}

}
