// learn about objet
public class indexDEMO {
    // ATTRIBUTE
    /*
     * Absicesse de l'objet point
     */
    int abscisse;
    /*
     * Ordonne de l'objet point
     */
    int ordonne;

    // Constructor
    /*
     * Ceci est un constructeur prennant
     */
    indexDEMO(int a, int o) {
        this.abscisse = a;
        this.ordonne = o;
    }

    indexDEMO() {
        this.abscisse=0;
        this.ordonne=0;
    }

    void seTranslater(int dx, int dy){
        this.abscisse = this.abscisse +dx;
        this.ordonne = this.ordonne + dy;
    }
}
