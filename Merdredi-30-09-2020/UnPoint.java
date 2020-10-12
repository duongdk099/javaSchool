/**
 * la classe UnPoint permet de representer des points 
 * sur un plan2D
 */
public class UnPoint
{
	/**
	 * attribut abscisse correspond a l'abscisse sur point
	 */
	int abscisse;
	
	/**
	 * attribut ordonnee correspond a l'ordonnee du point
	 */
	int ordonnee;
	
	/**
	 * constructeur par defaut
	 * construit un point de coordoonees (0,0)
	 */
	public UnPoint()
	{
		this.abscisse=0;
		this.ordonnee=0;
	}
	
	/**
	 * constructeur qui construit un point de coordonnees
	 * quelconque
	 *
	 * @param a abscisse du point construit
	 * @param o ordonnee du point construit
	 */
	public UnPoint(int a, int o)
	{
		this.abscisse=a;
		this.ordonnee=o;
	}



	/**
	 * constructeur par copie
	 * 
	 * @param p point à partir duquel copier
	 */
	public UnPoint(UnPoint p){
		//si pas de point
		if (p != null){
			this.abscisse = p.abscisse;
			this.ordonnee = p.ordonnee;
		} else{
			this.abscisse = 0;
			this.ordonnee = 0;
		}
	}

	/**
	 * methode seTranslater
	 * deplace le point selon un vecteur
	 * 
	 * @param dx variation sur axe abscisse
	 * 
	 * @param dy variation sur axe ordonnée
	 */
	
	void seTranslater(int dx, int dy){
		this.abscisse = this.abscisse + dx;
		this.ordonnee = this.ordonnee + dy;
	}

}
