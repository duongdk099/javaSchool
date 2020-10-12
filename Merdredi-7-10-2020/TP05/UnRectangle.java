/**
 * classe UnRectangle
 * modelise des rectangles
 */
class UnRectangle {

	/**
	 * attribut coin bas-gauche du rectangle
	 */
	UnPoint coin;

	/**
	 * attributs dimension du rectangle
	 */
	int largeur, hauteur;

	/**
	 * constructeur vide - rectangle unitaire (TD3)
	 */
	UnRectangle() {
		this.coin = new UnPoint();
		this.largeur = 1;
		this.hauteur = 1;
	}

	/**
	 * constructeur de rectangle a partir de 4 entiers
	 * 
	 * @param x
	 *            abscisse coin bas gauche
	 * @param y
	 *            abscisse coin bas droite
	 * @param l
	 *            largeur du rectangle
	 * @param h
	 *            hauteur du rectangle
	 */
	UnRectangle(int x, int y, int l, int h) {
		// TODO recuperer du TP03
	}

	/**
	 * constructeur par copie de rectangle
	 * (mis a l'origine si reference nulle)
	 * 
	 * @param r
	 *            rectangle a copier
	 */
	UnRectangle(UnRectangle r) {
		// TODO recuperer du TP03
	}

	/**
	 * constructeur de rectangle a partir d'un point et des dimensions
	 * (TD3)
	 * 
	 * @param cig
	 *            coin inferieur gauche
	 * @param l
	 *            largeur
	 * @param h
	 *            hauteur
	 */
	UnRectangle(UnPoint cig, int l, int h) {
		if (cig == null)
			this.coin = new UnPoint();
		else
			this.coin = new UnPoint(cig);
		if (l < 1)
			this.largeur = 1;
		else
			this.largeur = l;
		if (h < 1)
			this.hauteur = 1;
		else
			this.hauteur = h;
	}

	/**
	 * methode qui demande translation du rectangle
	 * cela revient a translater son coin
	 * 
	 * @param dx
	 *            variation selon axe abscisse
	 * @param dy
	 *            variation selon ax des ordonnees
	 */
	void seTranslater(int dx, int dy) {
		this.coin.seTranslater(dx, dy);
	}

	/**
	 * methode chargee de modifier la largeur du rectangle
	 * 
	 * @param dl
	 *            variation de largeur
	 */
	void modifierLargeur(int dl) {
		// TODO recuperer TP04
	}

	/**
	 * methode chargee de modifier la hauteur du rectangle
	 * 
	 * @param dh
	 *            variation de hauteur
	 */
	void modifierHauteur(int dh) {
		// TODO recuperer TP04
	}

	/**
	 * demande au rectangle de faire une rotation selon coin bas
	 * gauche
	 */
	void faireRotation() {
		// TODO recuperer TP04
	}

	/**
	 * demande au rectangle de faire une symetrie selon y=x
	 */
	void faireSymetrie() {
		// TODO recuperer TP04
	}

}
