import static libtest.Lanceur.*;
import static libtest.OutilTest.*;



/**
 * classe chargee de tester les constructeur et méthodes de Personnage
 * @author vthomas
 *
 */
public class TestPersonnage {

	/**
	 * test constructeur vide
	 */
	public void test_01_Constructeur_Vide()
	{
		Personnage p = new Personnage();
		assertEquals("erreur : pas bons pv", 10,p.pv);
		assertEquals("erreur : personnage n'a pas d'arme", false, p.monArme==null);
		assertEquals("erreur : pas bons degats", 3, p.monArme.degats);
		assertEquals("erreur : pas bonne vitesse", 2, p.monArme.vitesse);
	}

	/**
	 * test constructeur arme
	 */
	public void test_02_Constructeur_Arme()
	{
		Arme a= new Arme(5,6);
		Personnage p = new Personnage(a);
		assertEquals("erreur : pas bons pv", 10,p.pv);
		assertEquals("erreur : personnage n'a pas d'arme", false, p.monArme==null);
		assertEquals("erreur : pas bons degats", 5, p.monArme.degats);
		assertEquals("erreur : pas bonne vitesse", 6, p.monArme.vitesse);
	}

	/**
	 * test constructeur arme null
	 */
	public void test_03_Constructeur_ArmeNull()
	{
		Arme a = null;
		Personnage p = new Personnage(a);
		assertEquals("erreur : pas bons pv", 10,p.pv);
		assertEquals("erreur : personnage n'a pas d'arme", false, p.monArme==null);
		assertEquals("erreur : pas bons degats", 3, p.monArme.degats);
		assertEquals("erreur : pas bonne vitesse", 2, p.monArme.vitesse);
	}


	/**
	 * lancement des tests
	 */
	public static void main(String args[])
	{
		//appelle la methode statique de Lanceur
		lancer(new TestPersonnage(),args);
	}

}
