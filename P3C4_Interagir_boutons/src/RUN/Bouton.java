/**
 * 
 */
package RUN;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;

public class Bouton extends JButton implements MouseListener {
	private final String name;
	private Image img;

	public Bouton(final String str) {
		super(str);
		this.name = str;
		try {
			img = ImageIO.read(new File("vert.png"));
		} catch (final IOException e) {
			e.printStackTrace();
		}
		this.addMouseListener(this);
	}

	@Override
	public void paintComponent(final Graphics g) {
		final Graphics2D g2d = (Graphics2D) g;
		final GradientPaint gp = new GradientPaint(0, 0, Color.blue, 0, 20,
				Color.cyan, true);
		g2d.setPaint(gp);
		g2d.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		g2d.setColor(Color.black);
		g2d.drawString(this.name, this.getWidth() / 2
				- (this.getWidth() / 2 / 4), (this.getHeight() / 2) + 5);
	}

	@Override
	public void mouseClicked(final MouseEvent event) {
		// Inutile d'utiliser cette méthode ici
	}

	@Override
	public void mouseEntered(final MouseEvent event) {
		// Nous changeons le fond de notre image pour le jaune lors du survol,
		// avec le fichier fondBoutonHover.png
		try {
			img = ImageIO.read(new File("jaune.png"));
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void mouseExited(final MouseEvent event) {
		// Nous changeons le fond de notre image pour le vert lorsque nous
		// quittons le bouton, avec le fichier fondBouton.png
		try {
			img = ImageIO.read(new File("vert.png"));
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void mousePressed(final MouseEvent event) {
		// Nous changeons le fond de notre image pour le jaune lors du clic
		// gauche, avec le fichier fondBoutonClic.png
		try {
			img = ImageIO.read(new File("jaune.png"));
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void mouseReleased(final MouseEvent event) {

		// Nous changeons le fond de notre image pour le orange lorsque nous
		// relâchons le clic avec le fichier fondBoutonHover.png si la souris
		// est toujours sur le bouton
		if ((event.getY() > 0 && event.getY() < Bouton.getHeight())
				&& (event.getX() > 0 && event.getX() < Bouton.getWidth())) {
			try {
				img = ImageIO.read(new File("orange.png"));
			} catch (final IOException e) {
				e.printStackTrace();
			}
		}
		// Si on se trouve à l'extérieur, on dessine le fond par défaut
		else {
			try {
				img = ImageIO.read(new File("vert.png"));
			} catch (final IOException e) {
				e.printStackTrace();
			}
		}
	}
}
