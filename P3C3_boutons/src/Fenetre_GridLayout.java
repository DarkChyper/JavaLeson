import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Fenetre_GridLayout extends JFrame {
	public Fenetre_GridLayout() {
		this.setTitle("Bouton");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		// On définit le layout à utiliser sur le content pane
		// Trois lignes sur deux colonnes
		final GridLayout gl = new GridLayout(3, 2);
		gl.setHgap(5); // Cinq pixels d'espace entre les colonnes (H comme
						// Horizontal)
		gl.setVgap(5); // Cinq pixels d'espace entre les lignes (V comme
						// Vertical)
		this.setLayout(gl);
		// Ou en abrégé : GridLayout gl = new GridLayout(3, 2, 5, 5);
		// On ajoute le bouton au content pane de la JFrame
		this.getContentPane().add(new JButton("1"));
		this.getContentPane().add(new JButton("2"));
		this.getContentPane().add(new JButton("3"));
		this.getContentPane().add(new JButton("4"));
		this.getContentPane().add(new JButton("5"));
		this.setVisible(true);
	}
}