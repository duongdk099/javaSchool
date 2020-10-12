public class Arme {
    /*
    
    */
    int degats;
    int vitesse;
    /**
     * construire constructor Arme avec degats = 3 et vitesse = 2
     */
    public Arme(){
        this.degats = 3;
        this.vitesse = 2;
    }
    /*
    * Constructor Arme avec 2 parametres dgts et vts
    Si dgts, vts < 0 =>> mettre dgts, vts = 0
    Sinon le degats de Arme sera egal a dgts et le vts aussi
    */
    public Arme( int dgts,int vts){
        if (dgts <0) {
            this.degats = 0;
        }
        else{this.degats = dgts;}
        if (vts <0){
            this.vitesse = 0;
        }
        else{this.vitesse = vts;}
    }
    public static void main(String[] args) {
        Arme a = new Arme(5,3);
        System.out.println(a.degats);
    }
}
