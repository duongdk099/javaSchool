import static libtest.Lanceur.*;
import static libtest.OutilTest.*;



/**
 * classe chargee de tester les constructeur de rectangle
 * @author vthomas
 *
 */
public class Test1ConstructeurVide {
	
	/**
	 * test constructeur vide
	 */
	public void test_1_ConstructeurVide()
	{
		UnRectangle r=new UnRectangle();
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
		//appelle la methode statique de Lanceur
		lancer(new Test1ConstructeurVide(),args);
	}

}
