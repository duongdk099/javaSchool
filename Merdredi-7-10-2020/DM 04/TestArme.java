import static libtest.Lanceur.*;
import static libtest.OutilTest.*;



/**
 * classe chargee de tester les constructeur de Arme
 * @author vthomas
 *
 */
public class TestArme {
	
	/**
	 * test constructeur vide
	 */
	public void test_1_ConstructeurVide()
	{
		Arme arme=new Arme();
		assertEquals("pas bonne vitesse", 2, arme.vitesse);	
		assertEquals("pas bonne hauteur", 3, arme.degats);
	}
	
	/**
	 * test constructeur non vide > 0
	 */
	public void test_2_ConstructeurArme()
	{
		Arme arme=new Arme(10,20);
		assertEquals("pas bonne hauteur", 10, arme.degats);
		assertEquals("pas bonne vitesse", 20,arme.vitesse);	
	}
	
	/**
	 * test constructeur degats < 0 => degats =0
	 */
	public void test_3_ConstructeurArmeDegatsNeg()
	{
		Arme arme=new Arme(-5,20);
		assertEquals("pas bonne hauteur", 0, arme.degats);
		assertEquals("pas bonne vitesse", 20,arme.vitesse);	
	}
	
	/**
	 * test constructeur vitesse < 0 => vitesse =0
	 */
	public void test_4_ConstructeurArmeVitesseNeg()
	{
		Arme arme=new Arme(5,-1);
		assertEquals("pas bonne hauteur", 5, arme.degats);
		assertEquals("pas bonne vitesse", 0,arme.vitesse);	
	}
	
	/**
	 * test constructeur vitesse < 0 et degats <0 => vitesse = 0, degats = 0
	 */
	public void test_5_ConstructeurArmeToutNeg()
	{
		Arme arme=new Arme(-5,-1);
		assertEquals("pas bonne hauteur", 0, arme.degats);
		assertEquals("pas bonne vitesse", 0,arme.vitesse);	
	}
	
	
	
	
	/**
	 * lancement des tests
	 */
	public static void main(String args[])
	{
		//appelle la methode statique de Lanceur
		lancer(new TestArme(),args);
	}

}
