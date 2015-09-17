import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author dark
 * 
 */
public class Fenetre extends JFrame {
	private final JPanel pan = new JPanel();
	private final JButton bouton = new JButton("Mon bouton");

	/**
	 * 
	 */
	public Fenetre() {
		this.setTitle("Animation");
		this.setSize(300, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		// Ajout du bouton à notre content pane
		pan.add(bouton);
		// this.setContentPane(pan);
		this.getContentPane().add(bouton);
		this.setVisible(true);
	}
}