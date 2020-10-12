

/**
 * classe UnPoint
 * modelise des points
 */
class UnPoint {
	/**
	 * attributs coordonnees du point
	 */
	int abscisse, ordonnee;
	
	
	/**
	 * constructeur vide initialise un point (0,0)
	 */
	UnPoint() {
		this.abscisse = 0;
		this.ordonnee = 0;
	}

	/**
	 * constructeur a deux entiers
	 * 
	 * @param a
	 *            abscisse du point cree
	 * @param o
	 *            ordonnee du point cree
	 */
	UnPoint(int a, int o) {
		this.abscisse = a;
		this.ordonnee = o;
	}
	
	
	
	/**
	 * constructeur par copie
	 * 
	 * @param p
	 *            point a partir duquel copier
	 */
	UnPoint(UnPoint p) {
		// si pas de point
		if (p != null) {
			this.abscisse = p.abscisse;
			this.ordonnee = p.ordonnee;
		} else {
			this.abscisse = 0;
			this.ordonnee = 0;
		}
	}
	
	

	/**
	 * methode seTranslater
	 * deplace le point selon un vecteur
	 * 
	 * @param dx
	 *            variation sur axe abscisse
	 * @param dy
	 *            variation axe des ordonnees
	 */
	void seTranslater(int dx, int dy) {
		this.abscisse = this.abscisse + dx;
		this.ordonnee = this.ordonnee + dy;
	}

	double calculerDistance ( UnPoint p){
		// calcule le distance entre this et Unpoint p
		// Ox: axe des abscisses
		// Oy: axe des ordonnees
		int Ox = binhphuong(p.abscisse - this.abscisse) ;
		int Oy = binhphuong(p.ordonnee - this.ordonnee) ;
		int res = Ox + Oy;
		return Math.sqrt(res);
	}

	double calculerCarreDistance( UnPoint p){
		int Ox = binhphuong(p.abscisse - this.abscisse) ;
		int Oy = binhphuong(p.ordonnee - this.ordonnee) ;
		int res = Ox + Oy;
		return Math.sqrt(res)* Math.sqrt(res);
	}

	public int binhphuong(int n) {
		return n*n;
	}
	
}
