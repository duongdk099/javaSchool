import static libtest.Lanceur.*;
import static libtest.OutilTest.*;

/**
 * classe de test pour le TP05
 * methode avec resultat
 * 
 * @author vthomas
 * 
 */
public class TestMethodeUnPoint {

	/**
	 * test la methode de caclul de la distance au carre
	 */
	public void test_1_calculerCarre()
	{
		UnPoint p=new UnPoint(40,50);
		UnPoint p2=new UnPoint(40,60);
		assertEquals("mauvais calcul horizontal", 100, p.calculerCarreDistance(p2));
		p2=new UnPoint(70,90);
		assertEquals("mauvais calcul carre distance", 2500, p.calculerCarreDistance(p2));
		assertEquals("mauvais calcul distance = 0", 0, p.calculerCarreDistance(p));
	}
	
	/**
	 * test la methode de caclul de la distance 
	 */
	public void test_2_calculerDistance()
	{
		UnPoint p=new UnPoint(40,50);
		UnPoint p2=new UnPoint(40,60);
		assertEquals("mauvais calcul horizontal", 10, p.calculerDistance(p2));
		p2=new UnPoint(70,90);
		assertEquals("mauvais calcul distance", 50, p.calculerDistance(p2));
		assertEquals("mauvais calcul distance = 0", 0, p.calculerDistance(p));
	}

	/**
	 * lancement des tests
	 * 
	 * @param args
	 *            vide
	 */
	public static void main(String[] args) {
		lancer(new TestMethodeUnPoint(),args);
	}

}
