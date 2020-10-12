import static libtest.Lanceur.lancer;
import static libtest.OutilTest.*;


/**
 * classe chargee de tester les constructeur de rectangle
 * @author vthomas
 *
 */
public class TestUnPoint {
	
	
	/** 
	 * test du constructeur vide
	 */
	public void test1_constructeurVide()
	{
		//on construit le point
		UnPoint p=new UnPoint();
		//on verifie que son abscisse est 0
		assertEquals("abscisse devrait etre 0", 0, p.abscisse);
		//on verifie que son ordonnee est 0
		assertEquals("ordonnee devrait etre 0", 0, p.ordonnee);
	}
	
	/** 
	 * test du constructeur avec deux parametres
	 */
	public void test2_constructeurParam()
	{
		//on construit le point
		UnPoint p=new UnPoint(10,20);
		//on verifie que son abscisse est 10
		assertEquals("abscisse devrait etre 10", 10, p.abscisse);
		//on verifie que son ordonnee est 20
		assertEquals("ordonnee devrait etre 20", 20, p.ordonnee);
	}
	
	/**
	 * lancement des tests
	 */
	public static void main(String args[])
	{
		lancer(new TestUnPoint(),args);
	}

}
