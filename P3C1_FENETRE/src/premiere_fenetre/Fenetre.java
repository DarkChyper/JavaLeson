/**
 * 
 */
package premiere_fenetre;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author dark
 * 
 */
@SuppressWarnings("serial")
public class Fenetre extends JFrame {
	/**
	 * Constructeur par défaut
	 */
	public Fenetre() {
		this.setTitle("Ma première fenêtre Java");
		this.setSize(200, 200);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// this.setResizable(false);
		this.setUndecorated(false);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);

		this.setContentPane(panel);
		this.setContentPane(new Panneau());

		this.setVisible(true);
	}

	/**
	 * Constructeur avec paramètres
	 * 
	 * @param titre
	 * @param longueur
	 * @param largeur
	 */
	public Fenetre(final String titre, final int longueur, final int largeur,
			final boolean resize, final boolean decor) {
		this.setTitle(titre);
		this.setSize(longueur, largeur);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(resize);
		this.setUndecorated(decor);
		this.setVisible(true);
	}
}