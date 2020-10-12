import static libtest.Lanceur.*;
import static libtest.OutilTest.*;


/**
 * classe de test pour le TD05
 * methode sans resultat
 * 
 * @author vthomas
 * 
 */
public class TestMethodeUnCerclePrive {

	/**
	 * test le constructeur de cercle avec des int
	 */
	public void test_13_ConstructeurInt()
	{
		UnCercle c=new UnCercle(10, 20, 15);
		assertEquals("le centre ne doit pas etre null", true, c.retournerCentre()!=null);
		assertEquals("mauvaise abscisse", 10, c.retournerCentre().abscisse);
		assertEquals("mauvaise ordonnee", 20, c.retournerCentre().ordonnee);
		assertEquals("mauvais rayon", 15, c.retournerRayon());
		assertEquals("circonscrit est a faux", false, c.getCirconscrit());
		
	}
	
	/**
	 * test le constructeur de cercle avec unPoint et un int
	 */
	public void test_14_ConstructeurPointInt()
	{
		UnPoint p = new UnPoint(10,20);
		UnCercle c=new UnCercle(p, 15);
		assertEquals("le centre ne doit pas etre null", true, c.retournerCentre()!=null);
		assertEquals("le centre ne doit pas avoit la meme ref que le parametre", false, c.retournerCentre()==p);
		assertEquals("mauvaise abscisse", 10, c.retournerCentre().abscisse);
		assertEquals("mauvaise ordonnee", 20, c.retournerCentre().ordonnee);
		assertEquals("mauvais rayon", 15, c.retournerRayon());
		assertEquals("circonscrit est a faux", false, c.getCirconscrit());
		
	}
	
	/**
	 * test le constructeur de cercle avec unPoint null
	 */
	public void test_15_ConstructeurPointNull()
	{
		UnCercle c=new UnCercle(null, 15);
		assertEquals("le centre a la meme ref que le parametre", false, c.retournerCentre()==null);
		assertEquals("mauvaise abscisse", 0, c.retournerCentre().abscisse);
		assertEquals("mauvaise ordonnee", 0, c.retournerCentre().ordonnee);
		assertEquals("mauvais rayon", 15, c.retournerRayon());
		assertEquals("circonscrit est a faux", false, c.getCirconscrit());
	}
	
	/**
	 * test le constructeur de cercle avec untriangle - cas normal
	 */
	public void test_16_ConstructeurCercleTriangle()
	{
		UnTriangle t = new UnTriangle(new UnPoint(100,0),new UnPoint(0,100),new UnPoint(0,0));
		UnCercle c=new UnCercle(t);
		
		assertEquals("circonscrit doit etre a vrai", true, c.getCirconscrit());
		assertEquals("le rayon du cercle devrait etre 71)", 71,
				t.calculerRayonCercleCirconscrit());
		
		int x=t.calculerCentreCercleCirconscrit().abscisse;
		//verifie independance des references
		t.seTranslater(15,15);
		//on verifie que le cercle est independant du triangle
		assertEquals("le cercle ne devrait pas bouger",x,c.retournerCentre().abscisse);
		
		
	}
	
	/**
	 * test le constructeur de cercle avec untriangle - cas triangle null
	 */
	public void test_17_ConstructeurCercleTriangleNull()
	{
		UnTriangle t = null;
		UnCercle c=new UnCercle(t);
		assertEquals("circonscrit doit etre a vrai", true, c.getCirconscrit());
		assertEquals("associe ne doit pas etre null", true, c.retournerCentre()!=null);	
	}
	
	/**
	 * test le constructeur de cercle avec Uncercle - cas normal non circonscrit
	 */
	public void test_18_ConstructeurCercleNonCirconscrit()
	{
		UnCercle co=new UnCercle(10, 20, 15);
		UnCercle c=new UnCercle(co);
		assertEquals("le centre devrait etre non null", true, c.retournerCentre()!=null);
		assertEquals("le centre devrait avoir une autre reference", true, c.retournerCentre()!=co.retournerCentre());
		assertEquals("mauvaise abscisse", 10, c.retournerCentre().abscisse);
		assertEquals("mauvaise ordonnee", 20, c.retournerCentre().ordonnee);
		assertEquals("mauvais rayon", 15, c.retournerRayon());
		assertEquals("circonscrit est a faux", false, c.getCirconscrit());
	}
	
	/**
	 * test le constructeur de cercle avec Uncercle - cas normal  circonscrit
	 */
	public void test_19_ConstructeurCercleCirconscrit()
	{
		UnTriangle t = new UnTriangle(new UnPoint(105,0),new UnPoint(0,100),new UnPoint(0,0));
		UnCercle co=new UnCercle(t);
		UnCercle c=new UnCercle(co);
		assertEquals("circonscrit doit etre a vrai", true, c.getCirconscrit());

		int x=co.retournerCentre().abscisse;
		//verifie independance des references
		co.seTranslater(15,15);
		//on verifie que le cercle est independant du triangle
		assertEquals("le cercle ne devrait pas bouger",x,c.retournerCentre().abscisse);
	}
	
	/**
	 * test le constructeur de cercle avec Uncercle - cas Null
	 */
	public void test_20_ConstructeurCercleNull()
	{
		UnCercle c=null;
		UnCercle co=new UnCercle(c);
		assertEquals("circonscrit doit etre a false", false, co.getCirconscrit());
		assertEquals("le centre doit etre non null", true, co.retournerCentre()!=null);
	}
	
	/**
	 * test retournerrayon et retournercentre - cas cercle non circonscrit
	 */
	public void test_21_AccesCercleNonCirconscrit()
	{
		UnCercle co=new UnCercle(10,15,20);
		assertEquals("le centre doit etre non null", true, co.retournerCentre()!=null);
		assertEquals("abscisse du centre doit etre 10", 10, co.retournerCentre().abscisse);
		assertEquals("ordonnee du centre doit etre 15", 15, co.retournerCentre().ordonnee);
		assertEquals("le rayon doit etre de 20", 20, co.retournerRayon());		
	}
	
	/**
	 * test retournerrayon et retournercentre - cas cercle  circonscrit
	 */
	public void test_22_AccesCercleCirconscrit()
	{
		UnTriangle t=new UnTriangle(new UnPoint(100,0), new UnPoint(0, 100), new UnPoint());
		UnCercle co=new UnCercle(t);
		assertEquals("le centre doit etre non null", true, co.retournerCentre()!=null);
		assertEquals("abscisse du centre doit etre 50", 50, co.retournerCentre().abscisse);
		assertEquals("ordonnee du centre doit etre 50", 50, co.retournerCentre().ordonnee);
		assertEquals("le rayon doit etre de 71", 71, co.retournerRayon());		
	}
	
	


	/**
	 * lancement des tests
	 * 
	 * @param args
	 *            vide
	 */
	public static void main(String[] args) {
		lancer(new TestMethodeUnCerclePrive(),args);
	}

}
