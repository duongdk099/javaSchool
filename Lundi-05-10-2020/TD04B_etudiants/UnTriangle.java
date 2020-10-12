public class UnTriangle {
    UnPoint A, B, C;
    UnTriangle(UnPoint a, UnPoint b, UnPoint c){
        UnPoint A = new UnPoint(a);
        UnPoint B = new UnPoint(b);
        UnPoint C = new UnPoint(c);
    }

    UnTriangle (UnTriangle t){
        UnTriangle a = new UnTriangle(t);
    }
    void seTranslater( int dx, int dy){
        this.A.seTranslater(dx, dy);
        this.B.seTranslater(dx, dy);
        this.C.seTranslater(dx, dy);
    }
    boolean etreRectangle(){
        boolean rectangle = false;
        double distanceAB =this.A.calculerDistance(B);
        double distanceAC =this.A.calculerDistance(C);
        double distanceBC =this.B.calculerDistance(C);
        
        if((distanceAB*distanceAB +distanceAC*distanceAC) == distanceBC*distanceBC )  {
            rectangle = true;
        } else {
            rectangle = false;
        }
        return rectangle;
    }
    UnPoint calculerCentreCercleCirconscrit(){
        // resultat
        UnPoint res = null;
        double absRes = calculerXCirconscrit()/calculerDivCirconscrit();
        double odrRes = calculerYCirconscrit()/calculerDivCirconscrit();
        res.abscisse = (int)absRes;
        res.ordonnee = (int)odrRes;
        return res;
    }
    double calculerDivCirconscrit(){
        int yC = this.C.ordonnee;
        int yA = this.A.ordonnee;
        int yB = this.B.ordonnee;
        int xA = this.A.abscisse;
        int xB = this.B.abscisse;
        int xC = this.C.abscisse;
        double div = 2.0 * ( (yC-yA) * (xB-xA) - (xC-xA) *(yB-yA) );
        return div;
    }
    double calculerXCirconscrit(){
        int yC = this.C.ordonnee;
        int yA = this.A.ordonnee;
        int yB = this.B.ordonnee;
        int xA = this.A.abscisse;
        int xB = this.B.abscisse;
        int xC = this.C.abscisse;
        double div = this.calculerDivCirconscrit();
        int x = ( yC - yA ) * ( yB - yA ) * ( yB - yC ) + ( xA + xB ) * ( xB - xA )
        * ( yC - yA ) - ( xA + xC ) * ( xC - xA ) * ( yB - yA );
        return x/div;
    }
    double calculerYCirconscrit(){
        int yC = this.C.ordonnee;
        int yA = this.A.ordonnee;
        int yB = this.B.ordonnee;
        int xA = this.A.abscisse;
        int xB = this.B.abscisse;
        int xC = this.C.abscisse;
        double div = this.calculerDivCirconscrit();
        int y = ( xC - xA ) * ( xB - xA ) * ( xB - xC ) + ( yA + yB ) * ( yB - yA )
        * ( xC - xA ) - ( yA + yC ) * ( yC - yA ) * ( xB - xA );
        return y/div;
    }
    int calculerRayonCercleCIrconscrit(){
        int resultat = 0;
        UnPoint O = new UnPoint(calculerCentreCercleCirconscrit());
        double distanceAO = this.A.calculerDistance(O);
        resultat = (int)distanceAO;
        return resultat;
    }
}
