/**
 * Classe UnCercle modelise des cercles Version 2 - TP5
 * 
 * deux cas se produisent
 * - soit le cercle est asocie a un triangle circonscrit
 * vaut vrai et centre et rayon sont vides
 * - soit le cercle n'est pas associe a
 * un triangle circonscrit vaut faux et associe est vide
 */

class UnCercle {
	/**
	 * vaut true si le cercle est circonscrit a un triangle
	 */
	private boolean circonscrit;

	/**
	 * triangle (eventuel) auquel le cercle est circonscrit
	 */
	private UnTriangle associe;

	/**
	 * centre et rayons (eventuel) du cercle s'il est non circonscrit
	 * a un triangle
	 */
	private UnPoint centre;
	private int rayon;

	/**
	 * constructeur de Cercle non circonscrit a un triangle
	 * 
	 * @param x
	 *            abscisse du centre
	 * @param y
	 *            ordonnee du centre
	 * @param r
	 *            rayon du cercle
	 */
	UnCercle(int x, int y, int r) {
		// TODO a completer
		
	}

	/**
	 * constructeur de Cercle non circonscrit a un triangle
	 * 
	 * @param c
	 *            centre du cercle
	 * @param r
	 *            rayon du cercle
	 */
	UnCercle(UnPoint c, int r) {
		// TODO a completer

	}

	/**
	 * constructeur de Cercle circonscrit a un triangle
	 * 
	 * @param t
	 *            triangle pour construire cercle
	 */
	UnCercle(UnTriangle t) {
		// TODO a completer
	}

	/**
	 * constructeur par copie de Cercle
	 * 
	 * @param c
	 *            information d'origine
	 */
	UnCercle(UnCercle c) {
		// TODO a completer
	}

	/**
	 * methode qui retourne le centre
	 * 
	 * @return centre du cercle
	 */
	UnPoint retournerCentre() {
		UnPoint res = null;
		// TODO a completer
		return res;
	}

	/**
	 * methode qui retourne le rayon
	 * 
	 * @return rayon du cercle
	 */
	int retournerRayon() {
		int res = 0;
		// TODO a completer
		return res;
	}

	/**
	 * methode qui deplace le cercle
	 * 
	 * @param dx
	 *            variation selon axe des abscisses
	 * @param dy
	 *            variation selon axe des ordonnees
	 */
	void seTranslater(int dx, int dy) {
		// a completer
	}

	/**
	 * permet de savoir si le cercle est construit a partir d'un
	 * triangle
	 * 
	 * @return attribut circonscrit
	 */
	public boolean getCirconscrit() {
		return this.circonscrit;
	}

}
