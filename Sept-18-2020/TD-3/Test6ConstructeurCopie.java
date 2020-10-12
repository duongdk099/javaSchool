import static libtest.Lanceur.*;
import static libtest.OutilTest.*;



/**
 * classe chargee de tester les constructeur de rectangle
 * @author vthomas
 *
 */
public class Test6ConstructeurCopie {
	
	
	
	/**
	 * test constructeur par copie
	 */
	public void test_15_ConstructeurCopie()
	{
		UnRectangle origine=new UnRectangle(10, 20, 30, 40);
		UnRectangle r=new UnRectangle(origine);
		assertEquals("pas bonne largeur", 30, r.largeur);
		assertEquals("pas bonne hauteur", 40, r.hauteur);
		assertEquals("pas bonne abscisse", 10, r.coin.abscisse);
		assertEquals("pas bonne ordonne", 20, r.coin.ordonnee);		
		//reference differente
		assertEquals("meme reference dans les rectangles", false, origine.coin==r.coin);
	}
	
	/**
	 * test constructeur par copie
	 */
	public void test_16_ConstructeurCopieNull()
	{
		UnRectangle origine=null;
		UnRectangle r=new UnRectangle(origine);
		assertEquals("pas bonne largeur", 1, r.largeur);
		assertEquals("pas bonne hauteur", 1, r.hauteur);
		assertEquals("pas bonne abscisse", 0, r.coin.abscisse);
		assertEquals("pas bonne ordonne", 0, r.coin.ordonnee);		
	}
	
	/**
	 * lancement des tests
	 */
	public static void main(String args[])
	{
		lancer(new Test6ConstructeurCopie(),args);
	}

}
