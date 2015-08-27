
/**
 * Capitale est une Ville mais qui contient un attribut monument
 * @author dark
 * 
 */
public class Capitale extends Ville {

	private String monument;
	
	// COnstructeur par défaut
	public Capitale(){
		super();
		monument = "aucun";
	}
	
	// Constructeur complet 
	  //Constructeur d'initialisation de capitale
	  public Capitale(String nom, int hab, String pays, String monument){
	    super(nom, hab, pays);
	    this.monument = monument;
	  }  

	/* (non-Javadoc)
	 * @see Ville#toString()
	 */
	@Override
	public String toString() {
		String str = super.toString() + "\n \t ==> " + this.monument + " en est un monument";
		return str;
	}

	/**
	 * @return the monument
	 */
	public String getMonument() {
		return monument;
	}

	/**
	 * @param monument the monument to set
	 */
	public void setMonument(String monument) {
		this.monument = monument;
	}
	
}
