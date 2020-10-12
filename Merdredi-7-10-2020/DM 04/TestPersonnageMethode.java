import static libtest.Lanceur.*;
import static libtest.OutilTest.*;



/**
 * classe chargee de tester les constructeur et méthodes de Personnage
 * @author vthomas
 *
 */
public class TestPersonnageMethode {

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
	 * test methode perdrePV
	 */
	public void test_04_PerdrePv_ok()
	{
		Personnage p = new Personnage();
		p.perdrePv(4);
		assertEquals("erreur : pv apres perte", 6, p.pv);
	}


	/**
	 * test methode perdrePV devient negatif
	 */
	public void test_05_PerdrePv_pvNegatif()
	{
		Personnage p = new Personnage();
		p.perdrePv(11);
		assertEquals("erreur : pv apres perte doit etre 0", 0, p.pv);
	}

	/**
	 * test methode perdrePV degats negatifs
	 */
	public void test_06_PerdrePv_dgtsNegatif()
	{
		Personnage p = new Personnage();
		p.perdrePv(-1);
		assertEquals("erreur : ne devrait pas avoir de perte de pv", 10, p.pv);
	}

	/**
	 * test etreMort quand vivant
	 */
	public void test_07_etreMort_vivant()
	{
		Personnage p = new Personnage();
		assertEquals("personnage devrait pas etre mort", false, p.etreMort());
	}

	/**
	 * test etreMort quand mort
	 */
	public void test_08_etreMort_mort()
	{
		Personnage p = new Personnage();
		p.perdrePv(10);
		assertEquals("personnage devrait etre mort", true, p.etreMort());
	}

	/**
	 * test attaquer normal
	 */
	public void test_09_attaquer_normal()
	{
		Personnage p = new Personnage();
		Personnage p2 = new Personnage();
		p.attaquer(p2);
		assertEquals("victime a perdu des pvs", 7, p2.pv);
		assertEquals("attaquant pas perdu de pvs", 10, p.pv);
	}

	/**
	 * test attaquer arme de 6 degats
	 */
	public void test_10_attaquer_arme()
	{
		Arme a= new Arme(6,3);
		Personnage p = new Personnage(a);
		Personnage p2 = new Personnage();
		p.attaquer(p2);
		assertEquals("victime a perdu des pvs", 4, p2.pv);
		assertEquals("attaquant pas perdu de pvs", 10, p.pv);
	}

	/**
	 * test attaquer victime null
	 */
	public void test_11_attaquer_victimeNull()
	{
		Arme a= new Arme(6,3);
		Personnage p = new Personnage(a);
		Personnage p2 = null;
		p.attaquer(p2);
		assertEquals("attaquant pas perdu de pvs", 10, p.pv);
	}




	/**
	 * lancement des tests
	 */
	public static void main(String args[])
	{
		//appelle la methode statique de Lanceur
		lancer(new TestPersonnageMethode(),args);
	}

}
