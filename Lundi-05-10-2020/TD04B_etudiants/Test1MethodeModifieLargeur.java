import static libtest.Lanceur.*;
import static libtest.OutilTest.*;

/**
 * classe de etst pour le TD4
 * methode sans resultat
 * 
 * @author vthomas
 * 
 */
public class Test1MethodeModifieLargeur {

	/**
	 * modifie largeur quand tout va bien
	 */
	public void test_1_ModifieLargeurNormal() {
		UnRectangle r = new UnRectangle();
		assertEquals("pas la bonne largeur initiale", 1, r.largeur);
		r.modifierLargeur(1);
		assertEquals("ne modifie pas la largeur", 2, r.largeur);
	}

	/**
	 * modifie largeur quand elle devient negative
	 */
	public void test_2_ModifieLargeurNegative() {
		UnRectangle r = new UnRectangle();
		assertEquals("pas la bonne largeur initiale", 1, r.largeur);
		r.modifierLargeur(-12);
		assertEquals("la largeur ne peut pas etre negative", 1, r.largeur);
	}

	/**
	 * modifie largeur quand elle devient egal a 0
	 */
	public void test_3_ModifieLargeurNulle() {
		UnRectangle r = new UnRectangle();
		assertEquals("pas la bonne largeur initiale", 1, r.largeur);
		r.modifierLargeur(-1);
		assertEquals("la largeur ne peut pas etre nulle", 1, r.largeur);
	}
	
	/**
	 * modifie largeur quand on retire une valeur mais qu'elle reste >0
	 */
	public void test_4_ModifieLargeurRestePositif() {
		UnRectangle r = new UnRectangle(0,0,20,10);
		assertEquals("pas la bonne largeur initiale", 20, r.largeur);
		r.modifierLargeur(-10);
		assertEquals("la largeur ne peut pas etre nulle", 10, r.largeur);
	}

	/**
	 * modifie hauteur quand tout va bien
	 */
	public void test_5_ModifieHauteurNormal() {
		UnRectangle r = new UnRectangle();
		assertEquals("pas la bonne hauteur initiale", 1, r.hauteur);
		r.modifierHauteur(1);
		assertEquals("ne modifie pas la hauteur", 2, r.hauteur);
	}

	/**
	 * modifie hauteur quand elle devient negative
	 */
	public void test_6_ModifieHauteurNegative() {
		UnRectangle r = new UnRectangle();
		assertEquals("pas la bonne hauteur initiale", 1, r.hauteur);
		r.modifierHauteur(-12);
		assertEquals("la hauteur ne peut pas etre negative", 1, r.hauteur);
	}

	/**
	 * modifie hauteur quand elle devient egal a 0
	 */
	public void test_7_ModifieHauteurNulle() {
		UnRectangle r = new UnRectangle();
		assertEquals("pas la bonne hauteur initiale", 1, r.hauteur);
		r.modifierHauteur(-1);
		assertEquals("la hauteur ne peut pas etre nulle", 1, r.hauteur);
	}
	

	/**
	 * modifie hauteur quand elle dminiue mais reste > 0
	 */
	public void test_8_ModifieHauteurRestPositif() {
		UnRectangle r = new UnRectangle(0,0,20,10);
		assertEquals("pas la bonne hauteur initiale", 10, r.hauteur);
		r.modifierHauteur(-5);
		assertEquals("la hauteur ne peut pas etre nulle", 5, r.hauteur);
	}

	/**
	 * lancement des tests
	 * 
	 * @param args
	 *            vide
	 */
	public static void main(String[] args) {
		lancer(new Test1MethodeModifieLargeur(), args);
	}

}
