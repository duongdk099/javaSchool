public class MainAttaque {
    public static void main(String[] args) {
        Arme conanArm = new Arme(5, 3);
        Personnage conan = new Personnage(conanArm);
        Personnage aragorn = new Personnage();
        System.out.println("aragon avant l'attaque");
        aragorn.afficherArme();
        conan.attaquer(aragorn);
        System.out.println("aragon apres l'attaque");
        aragorn.afficherArme();

    }
}
