import static libtest.Lanceur.*;
import static libtest.OutilTest.*;



/**
 * classe chargee de tester les constructeur de rectangle
 * @author vthomas
 *
 */
public class Test3Constructeur4Int {
	
	
	
	/**
	 * test constructeur avec 4 entiers
	 */
	public void test_7_Constructeur4Int()
	{
		UnRectangle r=new UnRectangle(10,20,30,40);
		assertEquals("pas bonne largeur", 30, r.largeur);
		assertEquals("pas bonne hauteur", 40, r.hauteur);
		assertEquals("pas bonne abscisse", 10, r.coin.abscisse);
		assertEquals("pas bonne ordonne", 20, r.coin.ordonnee);		
	}
	
	/**
	 * test constructeur avec 4 entiers
	 */
	public void test_8_Constructeur4IntLargeurNegative()
	{
		UnRectangle r=new UnRectangle(10,20,-30,40);
		assertEquals("pas bonne largeur", 1, r.largeur);
		assertEquals("pas bonne hauteur", 40, r.hauteur);
		assertEquals("pas bonne abscisse", 10, r.coin.abscisse);
		assertEquals("pas bonne ordonne", 20, r.coin.ordonnee);		
	}
	
	/**
	 * test constructeur avec 4 entiers
	 */
	public void test_9_Constructeur4IntHauteurNegative()
	{
		UnRectangle r=new UnRectangle(10,20,30,-40);
		assertEquals("pas bonne largeur", 30, r.largeur);
		assertEquals("pas bonne hauteur", 1, r.hauteur);
		assertEquals("pas bonne abscisse", 10, r.coin.abscisse);
		assertEquals("pas bonne ordonne", 20, r.coin.ordonnee);		
	}
	
	/**
	 * test constructeur avec 4 entiers
	 */
	public void test_10_Constructeur4IntHauteurLargeurNegatives()
	{
		
		UnRectangle r=new UnRectangle(10,20,-30,-40);
		assertEquals("pas bonne largeur", 1, r.largeur);
		assertEquals("pas bonne hauteur", 1, r.hauteur);
		assertEquals("pas bonne abscisse", 10, r.coin.abscisse);
		assertEquals("pas bonne ordonne", 20, r.coin.ordonnee);		
	}
	
	
	/**
	 * lancement des tests
	 */
	public static void main(String args[])
	{
		lancer(new Test3Constructeur4Int(),args);
	}

}
