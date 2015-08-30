

/**
 * @author dark
 *
 */
public class VoitureSansPermis extends Voiture{
	protected boolean SP;
	
	public VoitureSansPermis(){
		super();
		SP = true;
	}

	/* (non-Javadoc)
	 * @see Voiture#toString()
	 */
	@Override
	public String toString() {
		String text = super.toString() + " SP";
		return text;
	}
	
	
}


