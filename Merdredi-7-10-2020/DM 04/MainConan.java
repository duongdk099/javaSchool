/**
 * MainConan
 */
public class MainConan {

    public static void main(String[] args) {
        Arme a = new Arme(5,3);
        Personnage conan = new Personnage(a);
        conan.afficherArme();
    }
}