/**
 * classe UnRectangle permet de modeliser des rectangles
 * 
 * Un rectangle est defini par 
 * 		- un coin bas-gauche 
 * 		- une largeur 
 * 		- et une hauteur
 */

class UnRectangle {
	/**
	 * attribut le coin bas-gauche du rectangle
	 */
	UnPoint coin;

	/**
	 * attributs largeur et hauteur du rectangle
	 */
	int largeur, hauteur;
	public UnRectangle(){
		this.largeur =1;
		this.hauteur=1;
		coin = new UnPoint();
	}

	UnRectangle(int c2, int c3, int l, int h)
	{
		coin = new UnPoint(c2,c3);
		if(l<0)
		{this.largeur=1;}
		else {this.largeur=l;}
		if(h<0)
		{this.hauteur=1;}
		else {this.hauteur=h;}
		
		
	}
	
	// TODO a completer
}