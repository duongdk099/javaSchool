import static libtest.Lanceur.*;
import static libtest.OutilTest.*;

/**
 * classe de test pour le TP05
 * methode avec resultat
 * 
 * @author vthomas
 * 
 */
public class TestMethodeUnTriangle {

	/**
	 * test du constructeur cas normal
	 * trois points existants
	 */
	public void test_3_constructeurTriangleNormal() {
		UnPoint p = new UnPoint(10, 10);
		UnPoint p1 = new UnPoint(20, 10);
		UnPoint p2 = new UnPoint(10, 20);
		UnTriangle t = new UnTriangle(p, p1, p2);

		// verfie les references des points
		assertEquals("les references du parametre et de A sont les memes", true,
				t.A != p);
		assertEquals("les references du parametre et de B sont les memes", true,
				t.B != p1);
		assertEquals("les references du parametre et de C sont les memes", true,
				t.C != p2);

		assertEquals("A doit etre non null", true, t.A != null);
		assertEquals("B doit etre non null", true, t.B != null);
		assertEquals("C doit etre non null", true, t.C != null);

		// verifie les valeurs
		assertEquals("l'abscisse de A n'est pas bonne", 10, t.A.abscisse);
		assertEquals("l'ordonnee de A n'est pas bonne", 10, t.A.ordonnee);
		assertEquals("l'ordonnee de B n'est pas bonne", 10, t.B.ordonnee);
		assertEquals("l'absisse de B n'est pas bonne", 20, t.B.abscisse);
		assertEquals("l'absisse de C n'est pas bonne", 10, t.C.abscisse);
		assertEquals("l'ordonnee de C n'est pas bonne", 20, t.C.ordonnee);
	}

	/**
	 * test du constructeur cas de pointsnull
	 * certains points sont null
	 */
	public void test_4_constructeurPointNull() {
		UnPoint p = new UnPoint(10, 10);
		UnPoint p1 = new UnPoint(20, 10);
		UnPoint p2 = new UnPoint(10, 20);
		UnTriangle t = new UnTriangle(p, p1, null);

		// verfie les references des points
		assertEquals("les references du parametre et de A sont les memes", true,
				t.A != p);
		assertEquals("les references du parametre et de B sont les memes", true,
				t.B != p1);
		assertEquals("la reference de C ne devrait pas etre null", true,
				t.C != null);

		// verifie les valeurs
		assertEquals("l'abscisse de A n'est pas bonne", 10, t.A.abscisse);
		assertEquals("l'ordonnee de A n'est pas bonne", 10, t.A.ordonnee);
		assertEquals("l'ordonnee de B n'est pas bonne", 10, t.B.ordonnee);
		assertEquals("l'absisse de B n'est pas bonne", 20, t.B.abscisse);
		assertEquals("l'absisse de C n'est pas bonne", 0, t.C.abscisse);
		assertEquals("l'ordonnee de C n'est pas bonne", 0, t.C.ordonnee);

		t = new UnTriangle(null, p1, p2);
		assertEquals("la reference de A ne devrait pas etre null", true,
				t.A != null);

		t = new UnTriangle(p, null, p2);
		assertEquals("la reference de B ne devrait pas etre null", true,
				t.B != null);
	}

	/**
	 * test du constructeur par copie - cas normal
	 */
	public void test_5_constructeurTriangle() {
		UnPoint p = new UnPoint(10, 10);
		UnPoint p1 = new UnPoint(20, 10);
		UnPoint p2 = new UnPoint(10, 20);
		UnTriangle t = new UnTriangle(p, p1, p2);
		UnTriangle t2 = new UnTriangle(t);

		// verfie les references des points
		assertEquals("les references de A sont les memes sur les deux rectangles", true,
				t.A != t2.A);
		assertEquals("les references de A sont les memes sur les deux rectangles", true,
				t.B != t2.B);
		assertEquals("les references de A sont les memes sur les deux rectangles", true,
				t.C != t2.C);
	}

	/**
	 * test du constructeur par copie - cas de triangle null
	 */
	public void test_6_constructeurTriangleNull() {
		UnTriangle t = null;
		UnTriangle t2 = new UnTriangle(t);

		// verfie les references des points
		assertEquals("les references de t2 ne devraient pas etre null", true,
				t2.A != null);
		assertEquals("les references de t2 ne devraient pas etre null", true,
				t2.B != null);
		assertEquals("les references de t2 ne devraient pas etre null", true,
				t2.C != null);
	}

	/**
	 * test de se translater - cas normal
	 */
	public void test_7_translaterTriangle() {

		UnTriangle t2 = new UnTriangle(new UnPoint(10, 10),
				new UnPoint(20, 30), new UnPoint(40, 50));
		t2.seTranslater(1, -2);

		// verfie les references des points
		assertEquals("A doit etre non null", true, t2.A != null);
		assertEquals("B doit etre non null", true, t2.B != null);
		assertEquals("C doit etre non null", true, t2.C != null);

		// verfie les coordonnees du triangle
		assertEquals("erreur abscisse de A", 11, t2.A.abscisse);
		assertEquals("erreur ordonnee de A", 8, t2.A.ordonnee);
		assertEquals("erreur abscisse de B", 21, t2.B.abscisse);
		assertEquals("erreur ordonnee de B", 28, t2.B.ordonnee);
		assertEquals("erreur abscisse de C", 41, t2.C.abscisse);
		assertEquals("erreur ordonnee de C", 48, t2.C.ordonnee);
	}

	/**
	 * test de estRectangle - cas resultat true
	 */
	public void test_8_estRectangle() {

		UnTriangle t = new UnTriangle(new UnPoint(0, 0), new UnPoint(1, 0),
				new UnPoint(0, 1));

		// verfie les coordonnees du triangle
		assertEquals("le triangle devrait etre rectangle", true,
				t.etreRectangle());
	}

	/**
	 * test de estRectangle - cas resultat false
	 */
	public void test_9_estRectangleFaux() {

		UnTriangle t = new UnTriangle(new UnPoint(10, 0), new UnPoint(1, 0),
				new UnPoint(0, 1));

		// verfie les coordonnees du triangle
		assertEquals("le triangle ne devrait pas etre rectangle", false,
				t.etreRectangle());
	}

	/**
	 * test de caclulerCentre - cas normal
	 */
	public void test_10_centreCirconscrit() {

		UnTriangle t = new UnTriangle(new UnPoint(0, 0), new UnPoint(100, 0),
				new UnPoint(0, 100));
		UnPoint centre = t.calculerCentreCercleCirconscrit();
		// verifie que lepoint n'est pas null
		assertEquals("le centre n'est pas calcule (null)", true, centre != null);
		// verfie les coordonnees du triangle
		assertEquals("l'abscisse du centre n'est pas bonne", 50,
				centre.abscisse);
		assertEquals("l'ordonnee du centre n'est pas bonne", 50,
				centre.ordonnee);

	}

	/**
	 * test de caclulerCentre - cas points alignes
	 */
	public void test_11_centreCirconscritAlignes() {

		UnTriangle t = new UnTriangle(new UnPoint(0, 0), new UnPoint(100, 0),
				new UnPoint(200, 0));
		UnPoint centre = t.calculerCentreCercleCirconscrit();
		// verifie que lepoint n'est pas null
		assertEquals("le centre devrait etre null)", true, centre == null);
	}

	/**
	 * test de cacluler Rayon - cas normal
	 */
	public void test_12_rayonCirconscrit() {

		UnTriangle t = new UnTriangle(new UnPoint(0, 0), new UnPoint(100, 0),
				new UnPoint(0, 100));
		// verifie que lepoint n'est pas null
		assertEquals("le rayon du cercle devrait etre 71)", 71,
				t.calculerRayonCercleCirconscrit());
	}

	/**
	 * lancement des tests
	 * 
	 * @param args
	 *            vide
	 */
	public static void main(String[] args) {
		lancer(new TestMethodeUnTriangle(), args);
	}

}
