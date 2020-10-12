import java.awt.Color;

/**
 * Modelise un crayon pouvant tracer des points et des lignes droites sur une {@link Feuille}.
 */
public class Crayon {
    private int abscisse;
    private int ordonnee;
    private Color couleur;
    private Feuille feuille;
    
    /**
     * Cree un crayon de couleur donnee, situe a l'origine.
     * @param c couleur du crayon
     */
    public Crayon(Color c) {
        this.abscisse = 0;
        this.ordonnee = 0;
        this.couleur = c;
    }
    
    /**
     * Cree un crayon de couleur noire, situe a l'origine.
     */
    public Crayon() {
        this.abscisse = 0;
        this.ordonnee = 0;
        this.couleur = Color.BLACK;
    }
    
    /**
     * Pose le crayon sur une Feuille, a sa position actuelle.
     * @param f Feuille sur laquelle poser le crayon
     */
    public void poser(Feuille f) {
        this.feuille = f;
        this.feuille.tracerPoint(this.abscisse, this.ordonnee, this.couleur);
    }

    /**
     * Ramene le crayon a l'origine. Attention, si le crayon est deja pose sur une feuille, cela tracera une ligne.
     */
    public void deplacerOrigine() {
        this.deplacer(-this.abscisse, -this.ordonnee);
    }
        
    /**
     * Leve le crayon de la Feuille sur laquelle il est pose.
     */
    public void lever() {
        if(this.feuille == null)
            System.out.println("Le crayon n'est pas pose.");
        this.feuille = null;
    }
    
    /**
     * Deplace le crayon.
     * @param dx deplacement horizontal
     * @param dy deplacement vertical
     */
    public void deplacer(int dx, int dy) {
        int x = this.abscisse, y = this.ordonnee;
        this.abscisse = x + dx;
        this.ordonnee = y + dy;
        if(this.feuille != null)
            this.feuille.tracerLigne(x, y, this.abscisse, this.ordonnee, this.couleur);
    }

	public void setColor (Color c){
        this.couleur = c;
    }
}