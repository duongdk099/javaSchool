import static libtest.Lanceur.*;
import static libtest.OutilTest.*;

public class TestMethodeRectangle {
    
	public void test_modifierHauteur()
	{
        UnRectangle rect = new UnRectangle(10, 10, 20, 40);
        rect.modifierHauteur(60);
		assertEquals("Pas la bonne hauteur: ", 60, rect.hauteur);
        rect.modifierHauteur(-1);
		assertEquals("Pas la bonne hauteur: ", 1, rect.hauteur);
        rect.modifierHauteur(0);
		assertEquals("Pas la bonne hauteur: ", 1, rect.hauteur);
    }
    public void test_modifierLargeur()
	{
        UnRectangle rect = new UnRectangle(10, 10, 20, 40);
        rect.modifierLargeur(60);
		assertEquals("Pas la bonne largeur: ", 60, rect.largeur);
        rect.modifierLargeur(-1);
		assertEquals("Pas la bonne largeur: ", 1, rect.largeur);
        rect.modifierLargeur(0);
		assertEquals("Pas la bonne largeur: ", 1, rect.largeur);
    }
    public void test_faireSymetrie()
	{
        UnRectangle rect = new UnRectangle(10, 5, 20, 40);
        rect.faireSymetrie();
        assertEquals("Pas la bonne abscisse: ", 5, rect.coin.abscisse);
        assertEquals("Pas la bonne ordonnée: ", 10, rect.coin.ordonnee);
        assertEquals("Pas la bonne largeur: ", 40, rect.largeur);
        assertEquals("Pas la bonne hauteur: ", 20, rect.hauteur);
    }
    public void test_faireRotation()
	{
        UnRectangle rect = new UnRectangle(60, 50, 20, 40);
        rect.faireRotation();
        assertEquals("Pas la bonne abscisse: ", 60, rect.coin.abscisse);
        assertEquals("Pas la bonne ordonnée: ", 30, rect.coin.ordonnee);
        assertEquals("Pas la bonne largeur: ", 40, rect.largeur);
        assertEquals("Pas la bonne hauteur: ", 20, rect.hauteur);
    }
	
	/**
	 * lancement des tests
	 */
	public static void main(String args[])
	{
		lancer(new TestMethodeRectangle(),args);
	}
}