import static libtest.Lanceur.*;
import static libtest.OutilTest.*;


/**
 * classe chargee de tester les constructeur de rectangle
 * @author vthomas
 *
 */
public class Test2Constructeur2Int {
	
	
	
	/**
	 * test constructeur largeur et hauteur
	 */
	public void test_2_Constructeur2Int()
	{
		UnRectangle r=new UnRectangle(2,3);
		assertEquals("pas bonne largeur", 2, r.largeur);
		assertEquals("pas bonne hauteur", 3, r.hauteur);
		assertEquals("pas bonne abscisse", 0, r.coin.abscisse);
		assertEquals("pas bonne ordonne", 0, r.coin.ordonnee);		
	}
	
	/**
	 * test constructeur largeur et hauteur avec largeur negative
	 */
	public void test_3_Constructeur2IntParamNegatif()
	{
		UnRectangle r=new UnRectangle(-2,2);
		assertEquals("pas bonne largeur", 1, r.largeur);
		assertEquals("pas bonne hauteur", 2, r.hauteur);
		assertEquals("pas bonne abscisse", 0, r.coin.abscisse);
		assertEquals("pas bonne ordonne", 0, r.coin.ordonnee);		
	}
	
	/**
	 * test constructeur largeur et hauteur avec largeur negative
	 */
	public void test_4_Constructeur2IntParamNegatif()
	{
		UnRectangle r=new UnRectangle(3,-2);
		assertEquals("pas bonne largeur", 3, r.largeur);
		assertEquals("pas bonne hauteur", 1, r.hauteur);
		assertEquals("pas bonne abscisse", 0, r.coin.abscisse);
		assertEquals("pas bonne ordonne", 0, r.coin.ordonnee);		
	}
	
	
	
	/**
	 * lancement des tests
	 */
	public static void main(String args[])
	{
		lancer(new Test2Constructeur2Int(),args);
	}

}
