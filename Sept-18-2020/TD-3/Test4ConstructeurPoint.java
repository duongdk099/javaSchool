import static libtest.Lanceur.*;
import static libtest.OutilTest.*;

/**
 * classe chargee de tester les constructeur de rectangle
 * 
 * @author vthomas
 * 
 */
public class Test4ConstructeurPoint {

	/**
	 * test constructeur avec Point
	 */
	public void test_5_ConstructeurPoint() {
		UnPoint p = new UnPoint(10, 20);
		UnRectangle r = new UnRectangle(p);
		assertEquals("pas bonne hauteur", 1, r.hauteur);
		assertEquals("pas bonne largeur", 1, r.largeur);
		assertEquals("pas bonne abscisse", 10, r.coin.abscisse);
		assertEquals("pas bonne ordonne", 20, r.coin.ordonnee);
		assertEquals("les references doivent etre differentes", false, r.coin==p);
		
	}

	/**
	 * test constructeur avec Point
	 */
	public void test_6_ConstructeurPointNull() {
		UnPoint p = null;
		UnRectangle r = new UnRectangle(p);
		assertEquals("pas bonne hauteur", 1, r.hauteur);
		assertEquals("pas bonne largeur", 1, r.largeur);
		assertEquals("pas bonne abscisse", 0, r.coin.abscisse);
		assertEquals("pas bonne ordonne", 0, r.coin.ordonnee);
	}

	/**
	 * lancement des tests
	 */
	public static void main(String args[]) {
		lancer(new Test4ConstructeurPoint(),args);
	}

}
