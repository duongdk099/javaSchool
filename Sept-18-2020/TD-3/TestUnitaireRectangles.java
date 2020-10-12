import static libtest.Lanceur.lancer;
import static libtest.OutilTest.*;


/**
 * classe chargee de tester les constructeur de rectangle
 * @author vthomas
 *
 */
public class TestUnitaireRectangles {
	
	/**
	 * test constructeur vide
	 */
	public void test_1_ConstructeurVide()
	{
		UnRectangle r=new UnRectangle();
		assertEquals("pas bonne hauteur", 1, r.hauteur);
		assertEquals("pas bonne largeur", 1, r.largeur);
		assertEquals("pas bonne abscisse", 0, r.coin.abscisse);
		assertEquals("pas bonne ordonne", 0, r.coin.ordonnee);		
	}
	
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
	public void test_6_ConstructeurPointNull()
	{
		UnPoint p=null;
		UnRectangle r=new UnRectangle(p);
		assertEquals("pas bonne largeur", 1, r.largeur);
		assertEquals("pas bonne hauteur", 1, r.hauteur);		
		assertEquals("pas bonne abscisse", 0, r.coin.abscisse);
		assertEquals("pas bonne ordonne", 0, r.coin.ordonnee);		
	}
	
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
		lancer(new TestUnitaireRectangles(),args);
	}

}
