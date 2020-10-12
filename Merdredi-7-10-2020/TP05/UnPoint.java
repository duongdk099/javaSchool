/**
 * classe UnPoint (etudiant TD5) modelise des points
 * 
 * @author vthomas
 * 
 */
class UnPoint {

	/**
	 * attribut coordoonees du point
	 */
	int abscisse, ordonnee;

	/**
	 * constructeur vide construit un point en (0,0)
	 */
	UnPoint() {
		this.abscisse = 0;
		this.ordonnee = 0;
	}

	/**
	 * constructeur par copie de point construit un nouveau point avec les memes
	 * coordonnees (en (0,0) si le parametre est null)
	 * 
	 * @param p
	 *            point origine
	 */
	UnPoint(UnPoint p) {
		if (p != null) {
			this.abscisse = p.abscisse;
			this.ordonnee = p.ordonnee;
		} else {
			this.abscisse = 0;
			this.ordonnee = 0;
		}
	}

	/**
	 * construit un point de coordonnees donnees
	 * 
	 * @param a
	 *            abscisse du point construit
	 * @param o
	 *            ordonnee du point construit
	 */
	UnPoint(int a, int o) {
		this.abscisse = a;
		this.ordonnee = o;
	}

	/**
	 * constructeur a partir de deux doubles
	 * 
	 * @param a
	 *            abscisse du point construit
	 * @param o
	 *            ordonne du point construit
	 */
	UnPoint(double a, double o) {
		// TODO a completer
		this.abscisse = (int)a;
		this.ordonnee = (int)o;
	}

	/**
	 * methode qui demande au point de se deplacer
	 * 
	 * @param dx
	 *            variation selon les abscisses
	 * @param dy
	 *            variation selon les ordonnees
	 */
	void seTranslater(int dx, int dy) {
		this.abscisse = this.abscisse + dx;
		this.ordonnee = this.ordonnee + dy;
	}

	/**
	 * methode qui demande au point de faire son symetrique
	 */
	void faireSymetrie() {
		// TODO recuperer du TD4
	}

	/**
	 * methode qui demande de claculer la distance avec un deuxieme point
	 * 
	 * @param p
	 *            deuxieme point
	 * 
	 * @return distance entre this et p
	 */
	int calculerDistance(UnPoint p) {
		int res=0;
		// TODO a completer
		int oX = p.abscisse - this.abscisse;
		int oY = p.ordonnee - this.ordonnee;
		int resi = oX*oX + oY*oY;
		res = (int)Math.sqrt(resi);
		return(res);
	}

	/**
	 * methode qui demande de claculer la distance au carre avec un deuxieme
	 * point
	 * 
	 * @param p
	 *            deuxieme point
	 * 
	 * @return distance entre this et p
	 */
	int calculerCarreDistance(UnPoint p) {
		int res=0;
		// TODO a completer
		res = calculerDistance(p) * calculerDistance(p);
		return res;
	}

}
