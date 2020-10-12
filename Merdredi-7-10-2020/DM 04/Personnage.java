public class Personnage {
    int pv;
    Arme monArme;
    /*
    Constructor Peronnage avec point de vie = 10 
    et monArme de Personnage apple Constructor Arme
    */ 
    public Personnage(){
        this.pv = 10;
        this.monArme = new Arme();
    }
    /*
    Constructor Personnage et prendre l'input Arme a
    Si a = null = >> mon Arme de Personnage appelle Constructor Arme et point de vie = 10
    Sinon =>> mon Arme prendre des values de l'input Arme et point de vie = 10
    */
    public Personnage(Arme a){
        if (a == null) {
            this.monArme = new Arme();
            this.pv = 10;
        } else {
            this.monArme = new Arme(a.degats, a.vitesse);
        this.pv = 10;
        }
    }
    /*
    afficher Arme avec tous infos
    */
    void afficherArme() {
        System.out.println("Arme: ");
        System.out.println(" -point de vie: "+this.pv);
        System.out.println(" -degats: "+monArme.degats);
        System.out.println(" -vitesse: "+monArme.vitesse);
    }

    public void perdrePv(int dgt){
        if(dgt >=0) this.pv -= dgt;
        if (this.pv < 0) this.pv = 0;
        afficherArme();
    }
    public boolean etreMort(){
        if (this.pv >0) {
            return false;
        } else {
            return true;
        }
    }
    public void attaquer(Personnage n){
        if(n != null){
            n.pv -= this.monArme.degats;
        }
        

    }
    public static void main(String[] args) {
        Personnage a = new Personnage();
        a.afficherArme();
        Arme armB = new Arme(5, 8);
        Personnage perB= new Personnage();
        perB.monArme = armB;
        perB.afficherArme();
        a.attaquer(perB);
        perB.afficherArme();
    }
}
