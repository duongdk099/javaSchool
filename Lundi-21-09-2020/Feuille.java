import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import javax.swing.JFrame;

/**
 * Modelise une Feuille, sur laquelle peuvent être traces des points
 * et des lignes.
 */
public class Feuille {
	static int position = 0;

	private JFrame f;
	
	private int largeur, hauteur;
	private BufferedImage image;
	private JPanel panel;

	/**
	 * Cree une Feuille format A4 vertical (largeur 210, hauteur 297),
	 * de titre donne.
	 * 
	 * @param titre
	 *            titre de la feuille
	 */
	public Feuille(String titre) {
		this(210, 297, titre);
	}

	/**
	 * Cree une Feuille de dimensions et titre donnes.
	 * 
	 * @param l
	 *            largeur
	 * @param h
	 *            hauteur
	 * @param titre
	 *            titre de la Feuille
	 */
	public Feuille(int l, int h, String titre) {
		f=new JFrame(titre);
		this.largeur = l;
		this.hauteur = h;
		this.image = new BufferedImage(this.largeur, this.hauteur, BufferedImage.TYPE_INT_RGB);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		this.panel = new JPanel() {
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(image, 0, 0, this);
			}
		};
		this.panel.setPreferredSize(new Dimension(l, h));
		this.effacer();
		f.getContentPane().add(panel);
		f.pack();
		f.setLocation(position, 0);
		f.setVisible(true);
		position += f.getWidth();
	}

	/**
	 * Efface les dessins de la feuille.
	 */
	public void effacer() {
		Graphics2D g = (Graphics2D) this.image.getGraphics();
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.largeur, this.hauteur);
		panel.repaint();
	}

	/**
	 * Trace un point a une position et d'une couleur donnees.
	 * 
	 * @param x
	 *            abscisse du point
	 * @param y
	 *            ordonnee du point
	 * @param c
	 *            couleur du point
	 */
	public void tracerPoint(int x, int y, Color c) {
		Graphics2D g = (Graphics2D) this.image.getGraphics();
		g.setColor(c);
		g.fillOval(x, y, 1, 1);
		panel.repaint();
	}

	/**
	 * Trace une ligne.
	 * 
	 * @param x1
	 *            abscisse de la premiere extremite
	 * @param y1
	 *            ordonnee de la premiere extremite
	 * @param x2
	 *            abscisse de la deuxieme extremite
	 * @param y2
	 *            ordonnee de la deuxieme extremite
	 * @param c
	 *            couleur de la ligne
	 */
	public void tracerLigne(int x1, int y1, int x2, int y2, Color c) {
		Graphics2D g = (Graphics2D) image.getGraphics();
		g.setColor(c);
		g.drawLine(x1, y1, x2, y2);
		panel.repaint();
	}
}