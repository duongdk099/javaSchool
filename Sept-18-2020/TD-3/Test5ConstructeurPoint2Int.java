import static libtest.Lanceur.*;
import static libtest.OutilTest.*;




/**
 * classe chargee de tester les constructeur de rectangle
 * @author vthomas
 *
 */
public class Test5ConstructeurPoint2Int {
	
	
	
	/**
	 * test constructeur avec point et deux entiers
	 */
	public void test_11_ConstructeurPoint2Int()
	{
		UnPoint p=new UnPoint(10,20);
		UnRectangle r=new UnRectangle(p,30,40);
		assertEquals("pas bonne largeur", 30, r.largeur);
		assertEquals("pas bonne hauteur", 40, r.hauteur);
		assertEquals("pas bonne abscisse", 10, r.coin.abscisse);
		assertEquals("pas bonne ordonne", 20, r.coin.ordonnee);		
		assertEquals("ne devrait pas avoir meme reference", false, r.coin==p);		
	}
	
	/**
	 * test constructeur avec point et deux entiers
	 */
	public void test_12_ConstructeurPoint2IntPointNull()
	{
		UnPoint p=null;
		UnRectangle r=new UnRectangle(p,30,40);
		assertEquals("pas bonne largeur", 30, r.largeur);
		assertEquals("pas bonne hauteur", 40, r.hauteur);
		assertEquals("pas bonne abscisse", 0, r.coin.abscisse);
		assertEquals("pas bonne ordonne", 0, r.coin.ordonnee);		
	}
	
	/**
	 * test constructeur avec point et deux entiers
	 */
	public void test_13_ConstructeurPoint2IntLargeurNegative()
	{
		UnPoint p=new UnPoint(10,20);
		UnRectangle r=new UnRectangle(p,-30,40);
		assertEquals("pas bonne largeur", 1, r.largeur);
		assertEquals("pas bonne hauteur", 40, r.hauteur);
		assertEquals("pas bonne abscisse", 10, r.coin.abscisse);
		assertEquals("pas bonne ordonne", 20, r.coin.ordonnee);		
		assertEquals("ne devrait pas avoir meme reference", false, r.coin==p);		
	}
	
	
	/**
	 * test constructeur avec point et deux entiers
	 */
	public void test_14_ConstructeurPoint2IntLargeurNegativePointNull()
	{
		UnPoint p=null;
		UnRectangle r=new UnRectangle(p,-30,40);
		assertEquals("pas bonne largeur", 1, r.largeur);
		assertEquals("pas bonne hauteur", 40, r.hauteur);
		assertEquals("pas bonne abscisse", 0, r.coin.abscisse);
		assertEquals("pas bonne ordonne", 0, r.coin.ordonnee);		
	}
	
	
	
	/**
	 * lancement des tests
	 */
	public static void main(String args[])
	{
		lancer(new Test5ConstructeurPoint2Int(),args);
	}

}
