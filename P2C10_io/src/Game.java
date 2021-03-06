import java.io.Serializable;

public class Game implements Serializable {
	private final String nom, style;
	private final double prix;
	private final Notice notice;

	public Game(final String nom, final String style, final double prix) {
		this.nom = nom;
		this.style = style;
		this.prix = prix;
		this.notice = new Notice();
	}

	@Override
	public String toString() {
		return "Nom du jeu : " + this.nom + "\nStyle de jeu : " + this.style
				+ "\nPrix du jeu : " + this.prix + "\n";
	}
}
