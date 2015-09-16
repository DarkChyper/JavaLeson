package premiere_fenetre;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

/**
 * @author dark
 * 
 */
public class Panneau0 extends JPanel {
	@Override
	public void paintComponent(final Graphics g) {
		// int x1 = this.getWidth()/4;
		// int y1 = this.getHeight()/4;
		// g.drawOval(x1, y1, this.getWidth()/2, this.getHeight()/2);
		// x1, y1, width, height
		// g.drawRect(10, 10, 50, 60);
		// g.fillRect(65, 65, 30, 40);
		// g.drawRoundRect(10, 10, 30, 50, 10, 10);
		// g.fillRoundRect(55, 65, 55, 30, 5, 5);
		g.drawLine(0, 0, this.getWidth(), this.getHeight());
		g.drawLine(0, this.getHeight(), this.getWidth(), 0);
		final int x[] = { 20, 30, 50, 60, 60, 50, 30, 20 };

		final int y[] = { 30, 20, 20, 30, 50, 60, 60, 50 };

		// g.drawPolyline(x, y, 8);

		// int x2[] = {50, 60, 80, 90, 90, 80, 60, 50};

		// int y2[] = {60, 50, 50, 60, 80, 90, 90, 80};

		// g.drawPolyline(x2, y2, 8);

		// final Font font = new Font("Courier", Font.BOLD, 20);
		// g.setFont(font);
		// g.setColor(Color.red);
		// g.drawString("Tiens ! Le Site du Zéro !", 10, 20);

		// try {
		// final Image img = ImageIO.read(new File("images.jpg"));
		// g.drawImage(img, 0, 0, this);
		// // Pour une image de fond
		// // g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		// } catch (final IOException e) {
		// e.printStackTrace();
		// }

		final Graphics2D g2d = (Graphics2D) g;

		final GradientPaint gp = new GradientPaint(0, 0, Color.RED, 30, 30,
				Color.cyan, false);

		g2d.setPaint(gp);

		g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
	}
}