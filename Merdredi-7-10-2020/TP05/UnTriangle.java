/****************************************
 *  classe UnTriangle
 * Version 2 - TP5
 *****************************************/

/**
 * classe unTriangle (etudiant TP5) modelise des triangles sous la
 * forme de trois points
 * 
 * @author vthomas
 * 
 */

class UnTriangle {

	/**
	 * attributs du triangle les trois sommets du triangle
	 */
	UnPoint A, B, C;

	/**
	 * construit un triangle a partir de trois points les attributs
	 * doivent etre d'autres references que les references des
	 * parametres
	 * 
	 * @param a
	 *            sommet A
	 * @param b
	 *            sommet B
	 * @param c
	 *            sommet C
	 */
	UnTriangle(UnPoint a, UnPoint b, UnPoint c) {
		this.A = new UnPoint(a);
        this.B = new UnPoint(b);
        this.C = new UnPoint(c);
		// TODO a completer
	}

	/**
	 * constructeur par copie les attributs du nouveau triangle
	 * doivent avoir des references differentes
	 * 
	 * @param t
	 *            triangle origine
	 */
	UnTriangle(UnTriangle t) {
		
		// TODO a completer
		if(t ==null){
			this.A= new UnPoint();
			this.B= new UnPoint();
			this.C= new UnPoint();
		
		}
		else{
		this.A = t.A;
		this.B = t.B;
		this.C = t.C;
		}

	}

	/**
	 * methode demandant au triangle de se translater
	 * 
	 * @param dx
	 *            variation selon l'axe abscisse
	 * @param dy
	 *            variation selon axe ordonnee
	 */
	void seTranslater(int dx, int dy) {
		// TODO a completer
		this.A.seTranslater(dx, dy);
        this.B.seTranslater(dx, dy);
        this.C.seTranslater(dx, dy);
	}

	/**
	 * teste si le triangle est un triangle-rectangle
	 * 
	 * @return vrai si et seulement si le triangle est rectangle
	 */
	boolean etreRectangle() {
		boolean rectangle = false;
		double distanceAB =this.A.calculerCarreDistance(B);
        double distanceAC =this.A.calculerCarreDistance(C);
        double distanceBC =this.B.calculerCarreDistance(C);
        
		if( (distanceAB + distanceAC == distanceBC) 
		|| (distanceAB + distanceBC == distanceAC)
		|| (distanceAC + distanceBC == distanceAB)) {
			rectangle = true;
			return rectangle;
        } else {
            return rectangle;
        }
		// TODO a completer
		
	}

	/**
	 * retourne le centre du cercle circonsrit au triangle
	 * 
	 * @return centre du cercle circonscrit
	 */
	UnPoint calculerCentreCercleCirconscrit() {
		// resultat
		UnPoint res = null;
		// TODO a completer
		double absRes = calculerXCirconscrit()/calculerDivCirconscrit();
        double odrRes = calculerYCirconscrit()/calculerDivCirconscrit();
        res.abscisse = (int)absRes;
        res.ordonnee = (int)odrRes;
		return res;
	}

	/**
	 * retourne le rayon du cercle du centrecirconscrit
	 * 
	 * @return rayon cercle circonscrit
	 */
	int calculerRayonCercleCirconscrit() {
		int resultat = 0;
		// TODO a completer
		UnPoint O = new UnPoint(calculerCentreCercleCirconscrit());
        double distanceAO = this.A.calculerDistance(O);
        resultat = (int)distanceAO;
		return (resultat);
	}

	/**
	 * retourne le denominateur pour faire les calculs du cercle
	 * circonscrit
	 * 
	 * @return denominateur cercle circonscrit
	 */
	double calculerDivCirconscrit() {
		int yC = this.C.ordonnee;
		int yA = this.A.ordonnee;
		int yB = this.B.ordonnee;
		int xA = this.A.abscisse;
		int xB = this.B.abscisse;
		int xC = this.C.abscisse;
		double div = 2.0 * ((yC - yA) * (xB - xA) - (xC - xA) * (yB - yA));
		return (div);
	}

	/**
	 * retourne l'abscisse du cercle circonscrit
	 * 
	 * @return abscisse cercle circonscrit
	 */
	double calculerXCirconscrit() {
		int yC = this.C.ordonnee;
		int yA = this.A.ordonnee;
		int yB = this.B.ordonnee;
		int xA = this.A.abscisse;
		int xB = this.B.abscisse;
		int xC = this.C.abscisse;
		double div = this.calculerDivCirconscrit();
		int x = (yC - yA) * (yB - yA) * (yB - yC) + (xA + xB) * (xB - xA)
				* (yC - yA) - (xA + xC) * (xC - xA) * (yB - yA);
		return x / div;
	}

	/**
	 * retourne l'ordonnee du cercle circonscrit
	 * 
	 * @return ordonnee cercle circonscrit
	 */
	double calculerYCirconscrit() {
		int yC = this.C.ordonnee;
		int yA = this.A.ordonnee;
		int yB = this.B.ordonnee;
		int xA = this.A.abscisse;
		int xB = this.B.abscisse;
		int xC = this.C.abscisse;
		double div = -this.calculerDivCirconscrit();
		int y = (xC - xA) * (xB - xA) * (xB - xC) + (yA + yB) * (yB - yA)
				* (xC - xA) - (yA + yC) * (yC - yA) * (xB - xA);
		return y / div;
	}

}
