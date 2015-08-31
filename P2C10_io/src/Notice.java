public class Notice {
	private final String langue;

	public Notice() {
		this.langue = "Français";
	}

	public Notice(final String lang) {
		this.langue = lang;
	}

	@Override
	public String toString() {
		return "\t Langue de la notice : " + this.langue + "\n";
	}
}